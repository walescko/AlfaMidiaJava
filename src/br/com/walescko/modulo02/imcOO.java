/**
 * @author: walescko
 * since 02/11/2022
 * Exemplos da aula de Orientação a Objetos do Curso Desenvolvedor Java projeto +praTi
 */
package br.com.walescko.modulo02;

import br.com.walescko.modulo02.imc.Imc;
import br.com.walescko.modulo02.imc.ImcNovo;

public class imcOO {
    public static void main(String[] args){

        System.out.println("Calculo do IMC");

        Imc imc1 = new Imc(80, 1.80);
        imc1.setWeigth(85);
        ImcNovo imc2 = new ImcNovo(81,1.81);

        System.out.println("A classificação é " + imc1.classificacao());
        System.out.printf("A classificação é %s\n", imc1.classificacao());

        System.out.println("A classificação é " + imc2.classificacao());
        System.out.printf("A classificação é %s\n", imc2.classificacao());

    }
}
