/**
 * @author: walescko
 * since 02/11/2022
 * Exemplos da aula de Orientação a Objetos do Curso Desenvolvedor Java projeto +praTi
 */
package br.com.walescko.modulo02.imc;

public class Imc {

    public double weigth;
    public double heigth;
    public double imc;

    public Imc(double weigth, double heigth){
        this.weigth = weigth;
        this.heigth = heigth;
    }

    public void calcularImc(){
        this.imc = ((this.weigth)/(this.heigth*this.heigth));
    }

}
