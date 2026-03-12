package Escola_v2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso(1, "Sistemas de Informação", "Curso de TI");

        Disciplina disciplina = new Disciplina(
            1, "POO101", "Programação Orientada a Objetos",
            60, "Fundamentos de POO", Modalidade.PRESENCIAL
        );

        curso.adicionarDisciplina(disciplina);

        Turma turma = new Turma(1, "T1", "Turma 2026/1", 2026, 1, disciplina);
        curso.adicionarTurma(turma);

        Professor professor = new Professor(1, "P001", "Carlos Silva", "99999-9999", "carlos@email.com");
        turma.setProfessor(professor);

        Aluno aluno = new Aluno(1, "A001", "João Souza", "88888-8888", "joao@email.com");

        Matricula matricula = new Matricula(new Date(), "ATIVO", 0.0, aluno, turma);

        System.out.println("Sistema acadêmico iniciado com sucesso.");
    }
}