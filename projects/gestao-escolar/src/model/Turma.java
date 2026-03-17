package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private String nome;
    private Professor professor; // associação 1:1
    private List<Aluno> alunos; // associação 1:N

    public Turma(String codigo, String nome, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    // Métodos para manipular alunos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    // Método para exibir os dados da turma
    public void exibirDetalhes() {
        System.out.println("=== TURMA ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos matriculados:");

        if(alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("  - "
                        + aluno.getNome()
                        + " ("
                        + aluno.getMatricula()
                        + ")");
            }
        }
    }


}
