/**
 * @author walescko
 * since 02/01/2022
 **/
package br.com.walescko.modulo01;

import java.util.Scanner;

public class Modulo01Desafio01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("TESTE DO WHILE");

        System.out.println("Tecle '1' para continuar e '0' para encerrar: ");
        int continue1 = scan.nextInt();

        do {
            System.out.println("Tecle '1' para continuar e '0' para encerrar: ");
            continue1 = scan.nextInt();
        } while (continue1 == 1);
        System.out.println("FIM");
    }
}
