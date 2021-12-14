package br.com.ecommerce.imposto;

import br.com.ecommerce.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
