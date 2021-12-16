package br.com.ecommerce.orcamento;

import br.com.ecommerce.DomainException;
import br.com.ecommerce.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    /* Adapter */
    public void registrar(Orcamento orcamento) {
        // Chamada HTTP para a API externa, várias opções:
        // URL Connection,  // Http Client,  // Lib Rest
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado");
        }

        String url = "https://jsonplaceholder.typicode.com/todos/"; //Exemplo de chamada
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }
}
