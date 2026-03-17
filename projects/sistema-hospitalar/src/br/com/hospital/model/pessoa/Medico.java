package br.com.hospital.model.pessoa;

public class Medico extends Funcionario{

    private String crm;
    private String especialidade;

    public Medico() {
        super();
    }

    public Medico(int id, String nome, String cpf, String telefone, String email, String matricula,
                  double salario, String crm, String especialidade) {
        super(id, nome, cpf, telefone, email, matricula, salario);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void realizarConsulta() {
        System.out.println("Consulta realizada pelo médico de CRM " + crm);
    }
}