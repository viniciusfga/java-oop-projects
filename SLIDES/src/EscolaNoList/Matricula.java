package EscolaNoList;

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
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}