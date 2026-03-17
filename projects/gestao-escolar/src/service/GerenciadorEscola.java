package service;

import model.*;
import java.io.*;
import java.util.*;

public class GerenciadorEscola implements Gerenciavel {
    private Escola escola;
    private Scanner input;

    public GerenciadorEscola(Escola escola, Scanner input) {
        this.escola = escola;
        this.input = input;
    }

    @Override
    public void adicionar() {
        try {
            System.out.println("\nCadastrar (1) Aluno ou (2) Professor?");
            int tipo = input.nextInt();
            input.nextLine();

            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("CPF: ");
            String cpf = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            input.nextLine();

            if (tipo == 1) {
                System.out.print("Matrícula: ");
                String matricula = input.nextLine();
                Aluno aluno = new Aluno(nome, cpf, idade, matricula);
                escola.adicionarPessoa(aluno);
                System.out.println("✅ Aluno cadastrado!");
                salvarPessoa(aluno);
            } else if (tipo == 2) {
                System.out.print("Disciplina: ");
                String disciplina = input.nextLine();
                Professor professor = new Professor(nome, cpf, idade, disciplina);
                escola.adicionarPessoa(professor);
                System.out.println("✅ Professor cadastrado!");
                salvarPessoa(professor);
            } else {
                System.out.println("❌ Opção inválida!");
            }
        } catch (InputMismatchException e) {
            System.out.println("❌ Entrada inválida! Digite novamente.");
            input.nextLine(); // limpa buffer
        }
    }

    @Override
    public void listar() {
        System.out.println("\n=== PESSOAS CADASTRADAS ===");
        for (Pessoa p : escola.getPessoas()) {
            System.out.println(p.getTipo() + ": " + p.getNome());
        }
    }

    @Override
    public void remover() {
        listar();
        try {
            System.out.print("Digite o índice da pessoa a remover: ");
            int indice = input.nextInt();
            input.nextLine();

            Pessoa p = escola.getPessoas().get(indice);
            escola.getPessoas().remove(p);
            System.out.println("✅ " + p.getTipo() + " removido(a)!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("❌ Índice inválido!");
        } catch (InputMismatchException e) {
            System.out.println("❌ Entrada inválida!");
            input.nextLine();
        }
    }

    // Persistência simples
    private void salvarPessoa(Pessoa pessoa) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("pessoas.txt", true))) {
            String linha = pessoa.getTipo() + ";" + pessoa.getNome() + ";" + pessoa.getCpf() + ";" + pessoa.getIdade();
            if (pessoa instanceof Aluno) {
                linha += ";" + ((Aluno) pessoa).getMatricula();
            } else if (pessoa instanceof Professor) {
                linha += ";" + ((Professor) pessoa).getDisciplina();
            }
            bw.write(linha);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("❌ Erro ao salvar pessoa: " + e.getMessage());
        }
    }

    public void carregarPessoas() {
        File arquivo = new File("pessoas.txt");
        if (!arquivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                String tipo = partes[0];
                String nome = partes[1];
                String cpf = partes[2];
                int idade = Integer.parseInt(partes[3]);

                if (tipo.equals("Aluno")) {
                    String matricula = partes[4];
                    escola.adicionarPessoa(new Aluno(nome, cpf, idade, matricula));
                } else if (tipo.equals("Professor")) {
                    String disciplina = partes[4];
                    escola.adicionarPessoa(new Professor(nome, cpf, idade, disciplina));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("❌ Erro ao carregar pessoas: " + e.getMessage());
        }
    }
}
