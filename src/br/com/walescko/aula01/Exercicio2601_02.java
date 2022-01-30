//As maçãs custam R$ 0,30 cada se forem compradas menos
//do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
//Escreva um programa que leia o número de maçãs compradas,
//calcule e escreva o valor total da compra.
/**
 * @author Walescko
 * since 01/27/2022
 **/


package br.com.walescko.aula01;

import java.util.Scanner;

public class Exercicio2601_02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Vendas de Maçãs");
        System.out.println("Maçã - R$ 0.30/unidade");
        System.out.println("Promoção: Na compra acima de uma dúzia R$ 0.25/unidade");

        System.out.print("Qual a quantidade de maçãs que deseja? ");
        int quantidadeMacas = scan.nextInt();

        double precoCompra = 0;

        if (quantidadeMacas < 12) {
            precoCompra = quantidadeMacas*0.30;
        } else {
            precoCompra = quantidadeMacas*0.25;
        }

        System.out.println("A quantidade de maçãs compradas é " + quantidadeMacas);
        System.out.format("O valor a pagar pelas maçãs é %.2f", precoCompra);



    }
}
