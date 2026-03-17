package service;

import model.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTurmas implements Gerenciavel {
    private Escola escola;
    private Scanner input;

    public GerenciadorTurmas(Escola escola, Scanner input) {
        this.escola = escola;
        this.input = input;
    }

    @Override
    public void adicionar() {
        if (escola.getPessoas().stream().noneMatch(p -> p instanceof Professor)) {
            System.out.println("⚠️ Nenhum professor cadastrado! Cadastre um primeiro.");
            return;
        }

        try {
            System.out.print("\nCódigo da turma: ");
            String codigo = input.nextLine();
            System.out.print("Nome da turma: ");
            String nome = input.nextLine();

            System.out.println("\nSelecione o professor responsável:");
            List<Pessoa> professores = escola.getPessoas().stream()
                    .filter(p -> p instanceof Professor).toList();
            for (int i = 0; i < professores.size(); i++) {
                System.out.println(i + " - " + professores.get(i).getNome());
            }
            int indiceProf = input.nextInt();
            input.nextLine();

            Professor profSelecionado = (Professor) professores.get(indiceProf);

            Turma turma = new Turma(codigo, nome, profSelecionado);
            escola.adicionarTurma(turma);

            System.out.println("✅ Turma criada!");
            salvarTurma(turma);

        } catch (Exception e) {
            System.out.println("❌ Erro ao criar turma: " + e.getMessage());
            input.nextLine();
        }
    }

    @Override
    public void listar() {
        System.out.println("\n=== TURMAS ===");
        List<Turma> turmas = escola.getTurmas();
        for (int i = 0; i < turmas.size(); i++) {
            Turma t = turmas.get(i);
            System.out.println(i + " - " + t.getNome() + " (Prof: " + t.getProfessor().getNome() + ")");
        }
    }

    @Override
    public void remover() {
        listar();
        try {
            System.out.print("Digite o índice da turma a remover: ");
            int indice = input.nextInt();
            input.nextLine();

            Turma t = escola.getTurmas().get(indice);
            escola.getTurmas().remove(t);
            System.out.println("✅ Turma removida!");
        } catch (Exception e) {
            System.out.println("❌ Erro ao remover turma: " + e.getMessage());
            input.nextLine();
        }
    }

    public void matricularAluno() {
        if (escola. getAlunos().isEmpty() || escola.getTurmas().isEmpty()) {
            System.out.println("⚠️ É necessário ter alunos e turmas cadastradas!");
            return;
        }

        listar();
        System.out.print("Selecione a turma: ");
        int indiceTurma = input.nextInt();
        input.nextLine();
        Turma turmaSelecionada = escola.getTurmas().get(indiceTurma);

        System.out.println("\nSelecione o aluno:");
        List<Pessoa> alunos = escola.getPessoas().stream()
                .filter(p -> p instanceof Aluno).toList();
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + " - " + alunos.get(i).getNome());
        }
        int indiceAluno = input.nextInt();
        input.nextLine();

        Aluno alunoSelecionado = (Aluno) alunos.get(indiceAluno);
        turmaSelecionada.adicionarAluno(alunoSelecionado);

        System.out.println("✅ Aluno matriculado!");
        salvarTurma(turmaSelecionada);
    }

    // Persistência simples das turmas
    private void salvarTurma(Turma turma) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("turmas.txt", true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(turma.getCodigo()).append(";")
                    .append(turma.getNome()).append(";")
                    .append(turma.getProfessor().getNome()).append(";");
            for (Aluno a : turma.getAlunos()) {
                sb.append(a.getNome()).append(",");
            }
            bw.write(sb.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("❌ Erro ao salvar turma: " + e.getMessage());
        }
    }

    public void carregarTurmas() {
        File arquivo = new File("turmas.txt");
        if (!arquivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                String codigo = partes[0];
                String nome = partes[1];
                String nomeProfessor = partes[2];

                Professor professor = (Professor) escola.getPessoas().stream()
                        .filter(p -> p instanceof Professor && p.getNome().equals(nomeProfessor))
                        .findFirst().orElse(null);
                if (professor == null) continue;

                Turma turma = new Turma(codigo, nome, professor);

                if (partes.length > 3) {
                    String[] alunosNome = partes[3].split(",");
                    for (String nomeAluno : alunosNome) {
                        if (!nomeAluno.isBlank()) {
                            Aluno aluno = (Aluno) escola.getPessoas().stream()
                                    .filter(p -> p instanceof Aluno && p.getNome().equals(nomeAluno))
                                    .findFirst().orElse(null);
                            if (aluno != null) turma.adicionarAluno(aluno);
                        }
                    }
                }

                escola.adicionarTurma(turma);
            }
        } catch (IOException e) {
            System.out.println("❌ Erro ao carregar turmas: " + e.getMessage());
        }
    }
}
