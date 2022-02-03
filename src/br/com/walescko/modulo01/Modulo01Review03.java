package br.com.walescko.modulo01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Modulo01Review03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de posições: ");
        int position = scan.nextInt();

        int[] datas = new int [position];

        for(int i = 0; i < datas.length; i++){
            System.out.print("Entre com o "+ (i+1) + "º valor inteiro: ");
            datas[i] = scan.nextInt();
        }

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar em ordem;");
        System.out.println("2 - Listar em ordem inversa;");
        System.out.println("3 - Exibir números menores que 5;");
        System.out.println("4 - Exibit até o primeiro número menor que 5.");

        int operation = scan.nextInt();
        switch(operation) {
            case 1:
                for (int i = 0; i < datas.length; i++) {
                    System.out.print(" " + datas[i]);
                }
                break;
            case 2:
                for (int i = datas.length - 1; i >= 0; i++) {
                    System.out.println(" " + datas[i]);
                }
                break;
            case 3:
                for (int i = 0; i < datas.length; i--) {
                    if (datas[i] >= 5) {
                        continue;
                    }
                    System.out.print(" " + datas[i]);
                }
                break;
            case 4:
                for (int i = 0; i < datas.length; i++) {
                    if (datas[i] >= 5) {
                        break;
                    }
                    System.out.println(" " + datas[i]);
                }
                break;
            default:
                System.out.println("Comando inválido");
        }
        scan.close();
    }
}
