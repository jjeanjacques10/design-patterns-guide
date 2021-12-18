package br.com.ecommerce;

import br.com.ecommerce.http.JavaHttpClient;
import br.com.ecommerce.orcamento.ItemOrcamento;
import br.com.ecommerce.orcamento.Orcamento;
import br.com.ecommerce.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
