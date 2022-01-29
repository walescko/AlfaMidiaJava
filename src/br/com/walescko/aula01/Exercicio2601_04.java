//Escreva um algoritmo que calcule a média aritmética das 3 notas dos
//alunos de uma classe. O algoritmo deverá ler, além das notas, o código
//do aluno e deverá ser encerrado quando o código for igual a zero.

//@atuhor Walescko
//since 01/27/2022

package br.com.walescko.aula01;

import java.util.Scanner;

public class Exercicio2601_04 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo de média de um aluno");
        System.out.print("Digite o código do aluno: ");
        int codigoAluno = scan.nextInt();

        Double[] nota = new Double[3];

        while(codigoAluno !=0) {
            double soma = 0;
            double media = 0;
            for (int i = 0; i <= 2; i++) {
                System.out.print("Digite a " + (i + 1) + "ª nota: ");
                nota[i] = scan.nextDouble();
            }

            for (int i = 0; i <= 2; i++){
                soma = soma + nota[i];
            }

            media = soma / nota.length;
            System.out.format("A média do aluno é %.1f\n", media);

            System.out.print("\nDigite o código no próximo aluno: ");
            codigoAluno = scan.nextInt();
        }
    }
}
