package br.com.universidade.servico;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Disciplina;
import br.com.universidade.modelo.Professor;

public class ProfessorServico {

    Aluno aluno;
    Professor professor;
    Disciplina disciplina;

    public ProfessorServico() {

    }

    public Boolean lancarNota(Aluno aluno, Disciplina disciplina) {
        return true;
    }

}
