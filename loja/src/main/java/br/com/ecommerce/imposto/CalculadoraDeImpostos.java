package br.com.ecommerce.imposto;

import br.com.ecommerce.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        /* Strategy */
        return imposto.calcular(orcamento);
    }

}
