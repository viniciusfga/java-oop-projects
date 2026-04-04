package br.com.hospital.model.pessoa;

public class Enfermeiro extends br.com.hospital.model.pessoa.Funcionario {

    public String coren;

    public Enfermeiro() {
        super();
    }

    public Enfermeiro(int id, String nome, String cpf, String telefone, String email, String matricula, double salario, String coren) {
        super(id, nome, cpf, telefone, email, matricula, salario);
        this.coren = coren;
    }

    public void assistirPaciente() {
        System.out.println("O enfermeiro está assistindo o paciente.");
    }
}
