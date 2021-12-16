package br.com.ecommerce.imposto;

import br.com.ecommerce.orcamento.Orcamento;

import java.math.BigDecimal;

/* Decorator */
public class ICMS extends Imposto {

    public ICMS(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
