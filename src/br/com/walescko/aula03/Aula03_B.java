package br.com.walescko.aula03;

import br.com.walescko.aula03.model.Jogador;

public class Aula03_B {
    public static void main(String[] args){

        Jogador jogador01 = new Jogador("Walescko");
        Jogador jogador02 = new Jogador("Walescko");

        jogador01.setQtGol(2);
        System.out.println("Nome: " + jogador01.getNome());
        System.out.println("Quantidade de gols: " + jogador01.getQtGol());

        if(jogador01.equals(jogador02)){
            System.out.println(("São iguais!"));
        } else {
            System.out.println("Não são iguais!");
        }

    }


}
