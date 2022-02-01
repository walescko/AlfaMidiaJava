package br.com.walescko.aula02;

import br.com.walescko.aula02.model.Pedido;

public class Aula02 {

    public static void main(String[] args){

//        Pedido pedido01 = new Pedido("João", 25.00, "Refrigernate", "Xis Bagulho");
        Pedido pedido01 = new Pedido("João");
         System.out.println(pedido01.mensagemFinal());

         pedido01.receberItemValor("Alaminuta", 30.00);
         pedido01.receberItemValor("Batata Frita", 50.00);
         pedido01.receberItemValor("Pizza de gordo", 60.00);
         pedido01.receberItemValor("refrigerante", 10.00);
         pedido01.receberItemValor("Marmita Fit", 17.90);
        System.out.println(pedido01.toString());

//        Pedido pedido02 = new Pedido();
//        pedido01.cliente = "Maria";
//        pedido01.valor = 30.00;
//        pedido01.itens[0] = "Suco sabor Amarelo";
//        pedido01.itens[1] = "Alaminuta loucadeboa";
//
//        System.out.println(pedido01.mensagemFinal());

////        Sem orientação a objetos...
//        String clientePedido01 = "João";
//        double valorPedido01 = 25.00;
//        String[] itensPedido01 = {"Refrigerante", "XIS Bagulho"};
//
//        String clientePedido02 = "Maria";
//        double valorPedido02 = 25.00;
//        String[] itensPedido02 = {"Refrigerante", "XIS Bagulho"};
//
//        System.out.println("O Cliente " + clientePedido01 + " fez uma compra de " + valorPedido01 + "com os seguintes itens: " + itensPedido01[0] + ", " + itensPedido01[1]);
//        System.out.println("O Cliente " + clientePedido02 + " fez uma compra de " + valorPedido02 + "com os seguintes itens: " + itensPedido02[0] + ", " + itensPedido02[1]);
    }
}
