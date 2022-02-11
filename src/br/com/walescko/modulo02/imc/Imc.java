/**
 * @author: walescko
 * since 02/11/2022
 * Exemplos da aula de Orientação a Objetos do Curso Desenvolvedor Java projeto +praTi
 */
package br.com.walescko.modulo02.imc;

public class Imc {

    private double weigth;
    private double heigth;
    private double imc;

    public Imc(double weigth, double heigth) {
        this.weigth = weigth;
        this.heigth = heigth;
    }

    public void calcularImc() {
        this.imc = ((this.weigth) / (this.heigth * this.heigth));
    }

    public String classificacao() {
        this.calcularImc();
        String classificacao = "";
        if (this.imc < 18.5) {classificacao = "magreza";}
        if (this.imc < 24.9) {classificacao = "normal";}
        if (this.imc < 29.9) {classificacao = "sobrepeso";}
        if (this.imc < 39.9) {classificacao = "obesidade";}
        if (this.imc >= 39.9) {classificacao = "obesidade grave";}
        return classificacao;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        if (weigth <=0) return;
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getImc() {
        return imc;
    }
}