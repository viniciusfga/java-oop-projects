package Escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int idTurma;
    private String codigo;
    private String nome;
    private int anoLetivo;
    private int semestre;
    private Disciplina disciplina;
    private Professor professor;
    private List<Matricula> matriculas = new ArrayList<>();

    public Turma(int idTurma, String codigo, String nome, int anoLetivo, int semestre, Disciplina disciplina) {
        this.idTurma = idTurma;
        this.codigo = codigo;
        this.nome = nome;
        this.anoLetivo = anoLetivo;
        this.semestre = semestre;
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        professor.ministrar(this);
    }

    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
}