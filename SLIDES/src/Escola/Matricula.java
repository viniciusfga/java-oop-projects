package Escola;

import java.util.Date;

public class Matricula {
    private Date dataMatricula;
    private String situacao;
    private double notaFinal;
    private Aluno aluno;
    private Turma turma;

    public Matricula(Date dataMatricula, String situacao, double notaFinal, Aluno aluno, Turma turma) {
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;
        this.notaFinal = notaFinal;
        this.aluno = aluno;
        this.turma = turma;
        turma.adicionarMatricula(this);
    }
}