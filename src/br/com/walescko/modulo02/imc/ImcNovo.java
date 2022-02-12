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

    @Override
    public String classificacao() {
        this.calcularImc();
        String classificacao = "";
        if (this.getImc() < 16) {classificacao = "Magreza grave";}
        if (this.getImc() < 17) {classificacao = "Magreza moderada";}
        if (this.getImc() < 18.5) {classificacao = "Magreza leve";}
        if (this.getImc() < 25) {classificacao = "Saudável";}
        if (this.getImc() < 30) {classificacao = "Sobrepeso";}
        if (this.getImc() < 35) {classificacao = "Obesidade Grau I";}
        if (this.getImc() < 40) {classificacao = "Obesidade Grau II";}
        if (this.getImc() >= 40) {classificacao = "Obesidade Grau III";}
        return classificacao;
    }
}
