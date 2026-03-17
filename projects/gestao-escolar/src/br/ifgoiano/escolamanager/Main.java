package br.ifgoiano.escolamanager;

import service.*;
import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Escola escola = new Escola("IF Goiano - Urutaí");

        GerenciadorEscola gerenciadorPessoas = new GerenciadorEscola(escola, input);
        GerenciadorTurmas gerenciadorTurmas = new GerenciadorTurmas(escola, input);

        gerenciadorPessoas.carregarPessoas();
        gerenciadorTurmas.carregarTurmas();

        int opcao;
        do {
            System.out.println("\n===============================");
            System.out.println("     🎓 ESCOLA MANAGER");
            System.out.println("===============================");
            System.out.println("1️⃣  Adicionar pessoa");
            System.out.println("2️⃣  Listar pessoas");
            System.out.println("3️⃣  Remover pessoa");
            System.out.println("4️⃣  Criar turma");
            System.out.println("5️⃣  Listar turmas");
            System.out.println("6️⃣  Remover turma");
            System.out.println("7️⃣  Matricular aluno em turma");
            System.out.println("0️⃣  Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> gerenciadorPessoas.adicionar();
                case 2 -> gerenciadorPessoas.listar();
                case 3 -> gerenciadorPessoas.remover();
                case 4 -> gerenciadorTurmas.adicionar();
                case 5 -> gerenciadorTurmas.listar();
                case 6 -> gerenciadorTurmas.remover();
                case 7 -> gerenciadorTurmas.matricularAluno();
                case 0 -> System.out.println("👋 Saindo...");
                default -> System.out.println("❌ Opção inválida!");
            }
        } while (opcao != 0);
    }
}
