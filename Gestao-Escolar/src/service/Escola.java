package service;

import model.Pessoa;
import model.Turma;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Pessoa> pessoas;
    private List<Turma> turmas;

    public Escola(String nome) {
        this.nome = nome;
        this.pessoas = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public List<Pessoa> getPessoas() { return pessoas; }
    public List<Turma> getTurmas() { return turmas; }

    public void listarPessoas() {
        System.out.println("=== PESSOAS CADASTRADAS ===");
        for (Pessoa p : pessoas) {
            System.out.println(p.getTipo() + ": " + p.getNome());
        }
    }

    public void listarTurmas() {
        System.out.println("=== TURMAS ===");
        for (Turma t : turmas) {
            System.out.println("- " + t.getNome() + " [" + t.getCodigo() + "]");
        }
    }

    public String getNome() { return nome; }
}
