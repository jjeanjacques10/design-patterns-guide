package br.com.ecommerce.orcamento.situacao;

import br.com.ecommerce.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

}
