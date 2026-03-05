package Escola;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int idProfessor;
    private String matricula;
    private String nome;
    private String telefone;
    private String email;
    private List<Turma> turmas = new ArrayList<>();

    public Professor(int idProfessor, String matricula, String nome, String telefone, String email) {
        this.idProfessor = idProfessor;
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void ministrar(Turma turma) {
        turmas.add(turma);
    }

    public String getNome() { return nome; }
}