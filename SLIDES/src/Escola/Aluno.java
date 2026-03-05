package Escola;

public class Aluno {
    private int idAluno;
    private String matricula;
    private String nome;
    private String telefone;
    private String email;

    public Aluno(int idAluno, String matricula, String nome, String telefone, String email) {
        this.idAluno = idAluno;
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdAluno() { return idAluno; }
    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
}