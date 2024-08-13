package application;


import entities.Hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gerador de Heróis");
        System.out.println("---------------------------");

        //Solicita o tipo do herói
        System.out.print("Informe o tipo do herói (mago, guerreiro, monge ou ninja): ");
        String tipo = scanner.next();

        //Solicita o nome do herói
        System.out.print("Informe o nome do herói: ");
        String nome = scanner.next();

        //Solicita a idade do herói
        System.out.print("Informe a idade do herói: ");
        int idade = scanner.nextInt();

        // Criando o Heói
        Hero hero = new Hero(nome, idade, tipo);

        System.out.println("*****************************");

        System.out.println("Heroi criado com sucesso!");

        System.out.println("******************************");
        System.out.println("Ataque ---------->>>");


        // Exibindo a mensagem no formato desejado
        System.out.println("O " + hero.getTipo() + " " +  hero.getNome() + " atacou usando " + hero.atacar());

        //Fechar o scanner
        scanner.close();

    }
}