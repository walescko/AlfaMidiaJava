//Exercicios da aula do curso de Java - AlfaMídia - projeto +praTi
//Escreva um programa para ler 2 valores e escrever na tela o maior deles
package br.com.walescko.aula01;

import java.util.Scanner;

public class Exercicio2601_01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("O maior de dois numeros!");
        System.out.print("Entre com o primeiro valor inteiro: ");
        int numero01 = scan.nextInt();
        System.out.print("Entre com o segundo valor inteiro: ");
        int numero02 = scan.nextInt();

        System.out.print("\nO maior entre os numeros digitados eh ");
        if (numero01 > numero02) {
            System.out.println(numero01);
        } else {
            System.out.println(numero02);
        }
        System.out.println("\nFim\n");
    }
}
