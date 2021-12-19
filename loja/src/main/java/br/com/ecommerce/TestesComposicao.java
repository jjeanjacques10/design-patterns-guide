package br.com.ecommerce;

import br.com.ecommerce.orcamento.ItemOrcamento;
import br.com.ecommerce.orcamento.Orcamento;
import br.com.ecommerce.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        /* Proxy */
        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor()); // Demora um pouco para fazer o cache
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
