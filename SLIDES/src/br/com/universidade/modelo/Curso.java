package br.com.universidade.modelo;

public class Curso {

    private int idCurso;
    private String nome;
    private String codigo;
    private String descricao;

    public Curso(int idCurso, String nome, String codigo, String descricao) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}