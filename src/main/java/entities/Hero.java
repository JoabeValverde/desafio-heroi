package entities;

import java.util.Scanner;

public class Hero {

    private String nome;
    private int idade;
    private String tipo;

    //Construtor padrao

    public Hero() {
    }


    //Construtor com parametros

    public Hero(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // metodos getters e setters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    // Método para retornar a descrição do ataque com base no tipo
    public String atacar() {
        String ataque;
        if (tipo.equalsIgnoreCase("mago")) {
            ataque = "magia";
        } else if (tipo.equalsIgnoreCase("guerreiro")) {
            ataque = "espada";
        } else if (tipo.equalsIgnoreCase("monge")) {
            ataque = "artes marciais";
        } else if (tipo.equalsIgnoreCase("ninja")) {
            ataque = "shuriken";
        } else {
            ataque = "ataque desconhecido";
        }

        return ataque;
    }

}

