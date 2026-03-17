package br.com.hospital.model.pessoa;

import br.com.hospital.model.hospital.Hospital;

public class Funcionario extends Pessoa {

    private String matricula;
    private double salario;

    Hospital hospital;

    public Funcionario() {
        super();
    }

    public Funcionario(int id, String nome, String cpf, String telefone, String email,
                       String matricula, double salario) {
        super(id, nome, cpf, telefone, email);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para o funcionário: " + getNome());
    }
}