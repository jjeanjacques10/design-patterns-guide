package br.com.ecommerce.orcamento;

public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DomainException(String mensagem) {
        super(mensagem);
    }
}
