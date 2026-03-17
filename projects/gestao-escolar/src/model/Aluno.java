package model;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade); // chama o construtor da superclasse Pessoa
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
    }

    @Override
    public String getTipo() {
        return "Aluno";
    }

}
