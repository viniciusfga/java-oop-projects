package Escola;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int idCurso;
    private String nome;
    private String descricao;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();

    public Curso(int idCurso, String nome, String descricao) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
}