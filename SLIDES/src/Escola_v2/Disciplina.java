package Escola_v2;

public class Disciplina {
    private int idDisciplina;
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private Modalidade modalidade;

    public Disciplina(int idDisciplina, String codigo, String nome, int cargaHoraria, String ementa, Modalidade modalidade) {
        this.idDisciplina = idDisciplina;
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.modalidade = modalidade;
    }

    public String getNome() { return nome; }
}