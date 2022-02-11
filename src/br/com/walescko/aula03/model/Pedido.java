package br.com.walescko.aula03.model;

import java.util.Arrays;

public class Pedido {

    private String[] itens = new String[10];
    private double valorTotal;
    private String cliente;

    public Pedido(String cliente) {
        this.cliente = cliente;
    }


    public String[] getItens() {
        String itensTotos ="";
        for(String item: itens){
            itensTotos = item + ", ";
        }

        return itens;
    }

    public void setItens(String[] itens){
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itens=" + Arrays.toString(itens) +
                ", valorTotal=" + valorTotal +
                ", cliente='" + cliente + '\'' +
                '}';
    }


}
