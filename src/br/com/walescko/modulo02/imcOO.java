/**
 * @author: walescko
 * since 02/11/2022
 * Exemplos da aula de Orientação a Objetos do Curso Desenvolvedor Java projeto +praTi
 */
package br.com.walescko.modulo02;

public class imcOO {
    public static void main(String[] args){

        Double peso = 80.00;
        Double altura = 1.80;

        Double imc = (peso/(altura*altura));
        System.out.println("Calculo do IMC");
        System.out.println("O imc é " + imc);
    }
}
