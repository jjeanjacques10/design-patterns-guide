package br.com.ecommerce;

import br.com.ecommerce.imposto.CalculadoraDeImpostos;
import br.com.ecommerce.imposto.ISS;
import br.com.ecommerce.imposto.Imposto;
import br.com.ecommerce.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }

}
