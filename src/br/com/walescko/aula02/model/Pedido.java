package br.com.walescko.aula02.model;

import java.util.Arrays;
import java.util.Objects;

public class Pedido {

    public String cliente;
    public double valor;
    public String[] itens = new String[5];

    //Constructors
    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public Pedido(String cliente, double valor, String item1, String item2) {
        this.cliente = cliente;
        this.valor = valor;
        this.itens[0] = item1;
        this.itens[1] = item2;
    }

    public String mensagemFinal(){
        String texto = "O Cliente " + cliente + " fez uma compra de " + valor + ", com os seguintes itens: "
                + itens[0] + ", "
                + itens[1] + ", "
                + itens[2] + ", "
                + itens[3] + ", "
                + itens[4] + ".";
        return texto;
    }

    public String retonaItens() {
        String itensLista = "";
        for (String item : this.itens) {
            itensLista += item + ", ";
        }
        itensLista = itensLista.substring(0, itensLista.length() - 2);
        return itensLista;
    }

    @Override
    public String toString() {
        return "O (A)  cliente='"
                + cliente + '\'' +
                " comprou os seguintes itens: " + retonaItens() +
                ", totalizando R$ " + valor + ".";
    }

    public void receberItemValor(String item, double valor){
        this.valor += valor;
        for(int i = 0 ; i < this.itens.length; i++){
            if(this.itens[i] == null){
                this.itens[i] = item;
                break;
            }

        }



    }


}
