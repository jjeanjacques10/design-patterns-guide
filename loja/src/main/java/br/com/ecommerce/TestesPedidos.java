package br.com.ecommerce;

import br.com.ecommerce.pedido.GeraPedido;
import br.com.ecommerce.pedido.GeraPedidoHandler;
import br.com.ecommerce.pedido.acao.EnviarEmailPedido;
import br.com.ecommerce.pedido.acao.SalvarNoBancoPedido;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        /* Command Handlers */
        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        /* Observer */
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarNoBancoPedido(), new EnviarEmailPedido())
        );

        handler.execute(gerador);
    }

}
