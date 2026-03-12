package br.com.universidade.modelo;

public class Turma {

    private int id;
    private String codigo;
    private String nome;
    private int anoLetivo;
    private int semestre;

    private Professor professor;
    private Disciplina disciplina;
    private Curso curso;

    public Turma(int id, String codigo, String nome, int anoLetivo, int semestre, Professor professor, Disciplina disciplina, Curso curso) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.anoLetivo = anoLetivo;
        this.semestre = semestre;
        this.professor = professor;
        this.disciplina = disciplina;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}