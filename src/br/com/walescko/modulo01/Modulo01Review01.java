package br.com.walescko.modulo01;

import java.util.Scanner;

public class Modulo01Review01 {

    public static void main(String[] args){
//        Calculo IMC - provavelmente eu já fiz isso em algum lugar.
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo do IMC");

        System.out.print("Entre com o peso (kg): ");
        double weigth = scan.nextDouble();
        System.out.print("Entre com a altura (m): ");
        double height = scan.nextDouble();

        double imc = weigth/(height*height);

        System.out.printf("Para a pessoa de peso %.2f kg com %.2f m de altura o IMC é %.2f\n", weigth, height, imc);

        String classification = "";
        if (imc < 18.5 ) {
            classification = "Magreza.";
        } else if (imc >= 18.5 && imc < 25){
            classification = "Normal.";
        } else if (imc >= 25 && imc < 30){
            classification = "Sobrepeso.";
        } else if (imc >= 30 && imc <= 40){
            classification = "Obesidade";
        } else {
            classification = "Obesidade Grave";
        }
        System.out.println("E a o seu imc indica: " + classification);
        scan.close();
    }
}
