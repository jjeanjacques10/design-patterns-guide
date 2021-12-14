package br.com.ecommerce.desconto;

import br.com.ecommerce.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        /* Chain of Responsibility */
        Desconto desconto = new DescontoOrcamentoMaisDeCincoItens(
                new DescontoOrcamentoValorMaisQueQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }

}
