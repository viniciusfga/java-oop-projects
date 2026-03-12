package br.com.universidade.modelo;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(Integer id, String nome, String telefone, String email, String matricula) {
        super(id, nome, telefone, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}