package br.com.ecommerce.pedido.acao;

import br.com.ecommerce.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando e-mail com dados do pedido");
    }
}
