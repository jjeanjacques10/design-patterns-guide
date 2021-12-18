package br.com.ecommerce;

import br.com.ecommerce.imposto.CalculadoraDeImpostos;
import br.com.ecommerce.imposto.ICMS;
import br.com.ecommerce.imposto.ISS;
import br.com.ecommerce.orcamento.ItemOrcamento;
import br.com.ecommerce.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS(null)));
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
