package br.com.hospital.model.pessoa;

public class Paciente extends br.com.hospital.model.pessoa.Pessoa {
    public String numeroProntuario;
    public String tipoSanguineo;

    public Paciente() {
        super();
    }

    public Paciente(int id, String nome, String cpf, String telefone, String email,
                    String numeroProntuario, String tipoSanguineo) {
        super(id, nome, cpf, telefone, email);
        this.numeroProntuario = numeroProntuario;
        this.tipoSanguineo = tipoSanguineo;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada para o paciente.");
    }
}