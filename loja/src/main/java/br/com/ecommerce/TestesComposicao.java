package br.com.ecommerce;

import br.com.ecommerce.orcamento.ItemOrcamento;
import br.com.ecommerce.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
    }
}
