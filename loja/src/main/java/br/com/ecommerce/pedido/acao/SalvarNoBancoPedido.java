package br.com.ecommerce.pedido.acao;

import br.com.ecommerce.pedido.Pedido;

public class SalvarNoBancoPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no Banco de Dados");
    }
}
