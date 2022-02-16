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

    public Double lerDouble(String texto){
        boolean continuarLeitura = true;
        double valor = 0;
        while (continuarLeitura){
            System.out.print(texto);
            try {
                valor = Double.parseDouble(scan.nextLine());
                continuarLeitura = false;
            } catch (NumberFormatException e){
                System.out.println("Entrada com valor inválido!");
            }
        }
        return valor;
    }

    public void lerPeso() {
        this.setWeigth(this.lerDouble("Entre com o peso: "));
    }
    public void lerAltura(){
        this.setHeigth(this.lerDouble("Entre com a altura: "));
    }
}
