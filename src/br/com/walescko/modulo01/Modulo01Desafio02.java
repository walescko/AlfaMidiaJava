/**
 * @author walescko
 * since 02/01/2022
 **/
package br.com.walescko.modulo01;

import java.util.Scanner;

public class Modulo01Desafio02 {

    public static void ImcCalc(double height, double weight) {

        double[] weightImc = {18.5, 24.9, 29.9, 39.9, 99999};
        String[] imcClassification = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};

        double imc = weight/(height*height);

        System.out.printf("O IMC é %.2f\n", imc);

        int i = 0;
        while (imc > weightImc[i]){
            i++;
        }
        System.out.println("E a classificação é: " + imcClassification[i]);
        Option();
    }

    public static void Option(){
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA CALCULO IMC - Walescko");
        System.out.print("Tecle 's' para calcular o IMC ou 'n' para encerrar:");
        String option = scan.next();

        switch (option.charAt(0)) {
            case 's': {
                System.out.println("Calculo do IMC");
                System.out.print("Entre com a altura (m): ");
                double height = scan.nextDouble();
                System.out.print("Entre com o peso (kg): ");
                double weigth = scan.nextDouble();

                ImcCalc(height, weigth);

                break;
            }
            case 'n': {
                System.out.println("Você encerrou o programa!");
                break;
            }
            default:
                System.out.println("Opção Inválida!");
                returnOption();
        }
    }

    //    Gambiarra para evitar erro - tenho que ver como resolver isso.
    public static void returnOption(){
        Option();
    }

    public static void main(String[] args) {

        Option();

    }


}
