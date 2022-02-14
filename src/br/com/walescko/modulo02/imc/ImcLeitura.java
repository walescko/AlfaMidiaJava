package br.com.walescko.modulo02.imc;

import java.util.Scanner;

public class ImcLeitura extends Imc {

    Scanner scan = new Scanner(System.in);
    public ImcLeitura(double weigth, double heigth) {
        super(weigth, heigth);

    }

    public ImcLeitura() {
        super(80,1.79);
    }

    public void lerPeso() {
        System.out.print("Entre com o peso: ");
        this.setWeigth(scan.nextDouble());
    }
    public void lerAltura(){
        System.out.print("Entre com a altura: ");
        this.setHeigth(scan.nextDouble());
    }
}
