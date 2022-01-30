//Escreva um algoritmo que leia 10 valores e encontre o maior e o
//menor deles. Mostre o resultado.
/**
    * @author Walescko
    * since 01/27/2022
**/


package br.com.walescko.aula01;

import java.util.Scanner;

public class Exercicio2601_05 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Maior e menor de 10 números!");

        int[] numerosLista = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i+1) +"º valor: ");
            numerosLista[i] = scan.nextInt();
        }

        System.out.print("Valores digitados: " + numerosLista[0]);
        for (int i = 1 ; i < 10; i++){
            int numero = numerosLista[i];
            System.out.print(", " +numero);
        }

        int maior = 0;
        int menor = 0;
        int auxiliar = 0;

        for (int i = 0; i < 10; i++){
            if (maior < numerosLista[i]){
                maior = numerosLista[i];
            }
            if (menor > numerosLista[i]){
                menor = numerosLista[i];
            }
        }
        System.out.println("\n");
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);
        System.out.println("Fim");

        scan.close();
    }
}
