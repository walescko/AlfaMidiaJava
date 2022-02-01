/**
 * @author walescko
 * since 02/01/2022
 **/


package br.com.walescko.modulo01;

import java.util.Scanner;

public class Modulo01Review02 {

    public static void ImcCalc(double height, double weight) {

        double[] weightImc = {18.5, 24.9, 29.9, 39.9, 99999};
        String[] imcClassification = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};

        double imc = weight/(height*height);

        System.out.printf("O IMC é %.2f\n", imc);
        String classification = "";

        int i = 0;
        while (imc > weightImc[i]){
            i++;
        }
        classification = imcClassification[i];
        System.out.println("E a classificação é: " + classification);
    }

    //metodo principal
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo do IMC");

        System.out.print("Entre com a altura (m): ");
        double height = scan.nextDouble();
        System.out.print("Entre com o peso (kg): ");
        double weigth = scan.nextDouble();

        ImcCalc(height, weigth);

        scan.close();
    }
}