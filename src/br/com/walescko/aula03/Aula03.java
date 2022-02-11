package br.com.walescko.aula03;

import br.com.walescko.aula02.model.Pedido;

public class Aula03 {
    public static void main(String[]args){

        Pedido pedido01 = new Pedido("João");

        pedido01.itens = new String[]{"lanche", "refri", "pitaia", "açaí", "suco"};

        System.out.println(pedido01);

    }
}
