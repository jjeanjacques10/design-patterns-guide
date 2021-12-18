package br.com.ecommerce.pedido.acao;

import br.com.ecommerce.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
