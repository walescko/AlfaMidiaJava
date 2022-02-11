/**
 * @author: walescko
 * since 02/11/2022
 * Exemplos da aula de Orientação a Objetos do Curso Desenvolvedor Java projeto +praTi
 */
package br.com.walescko.modulo02;

import br.com.walescko.modulo02.imc.Imc;

public class imcOO {
    public static void main(String[] args){

        System.out.println("Calculo do IMC");

        Imc imc1 = new Imc(80, 1.80);
        imc1.calcularImc();
        System.out.println("O IMC é " + imc1.imc);
        System.out.printf("O IMC é %.4f", imc1.imc);

    }
}
