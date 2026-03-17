import java.util.List;

public class Hospital {
    public String nome;
    public String endereco;
    public String telefone;

    List<Funcionario> funcionarios;

    public Hospital() {
    }

    public Hospital(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void admitirPaciente() {
        System.out.println("Paciente admitido no hospital " + nome + ".");
    }

}
