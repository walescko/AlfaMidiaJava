//Um programa que leia o salário bruto de um funcionário e mostre o valor liquido.
//Se o salário for menor que R$1.100, o desconto de INSS é 6%
//Até R$2.500, 8%
//Até R$4.800 10%
//Maior que R$ 4.800 15%

//@atuhor Walescko
//since 01/27/2022

package br.com.walescko.aula01;

import java.util.Scanner;

public class Exercicio2601_03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo do Salário Liquido");
        System.out.print("Qual o valor do salário? ");
        double salarioBruto = scan.nextDouble();

        double salarioLiquido = 0;
        double descontoINSS = 0;

        if (salarioBruto <= 1100){
            descontoINSS = salarioBruto*0.06;
        }
        if (salarioBruto <= 4800) {
            descontoINSS = salarioBruto*0.10;
        }
        if (salarioBruto > 4800){
            descontoINSS = 4800*0.15;
        }

        salarioLiquido = salarioBruto - descontoINSS;

        System.out.format("O salário líquido de R$ %.2f é R$ %.2f, sendo o desconto do INSS igual %.2f", salarioBruto, salarioLiquido, descontoINSS);

    }

}
