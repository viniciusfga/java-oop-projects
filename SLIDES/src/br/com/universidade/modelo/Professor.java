package br.com.universidade.modelo;

public class Professor extends Pessoa {

    private String matricula;

    public Professor() {
        super();
    }

    public Professor(Integer id, String nome, String telefone, String email, String matricula) {
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