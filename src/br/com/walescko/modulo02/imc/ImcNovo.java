/**
 * @author: walescko
 * since 02/11/2022
 * Exemplos da aula de Orientação a Objetos do Curso Desenvolvedor Java projeto +praTi
 */
package br.com.walescko.modulo02.imc;

public class ImcNovo extends Imc{

    public ImcNovo(double weigth, double heigth){
        super(weigth, heigth);
    }

    public String classificacao(){
        this.calcularImc();
        String classificacao = "";
        if (this.imc < 16) {classificacao = "Magreza grave";}
        if (this.imc < 17) {classificacao = "Magreza moderada";}
        if (this.imc < 18.5) {classificacao = "Magreza leve";}
        if (this.imc < 25) {classificacao = "Saudável";}
        if (this.imc < 30) {classificacao = "Sobrepeso";}
        if (this.imc < 35) {classificacao = "Obesidade Grau I";}
        if (this.imc < 40) {classificacao = "Obesidade Grau II";}
        if (this.imc >= 40) {classificacao = "Obesidade Grau III";}
        return classificacao;


    }

}
