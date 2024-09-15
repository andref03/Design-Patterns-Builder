package br.ifnmg.edu.designpatternsdecorator;

/**
 * É a classe responsável por criar um produto original, sem embalagem e/ou 
 * desconto aplicados.
 * 
 * @author andref03
 */
public class ProdutoBase implements Produto {
    
    private final String descricao;
    private final double preco;

    public ProdutoBase(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public double obterPreco() {
        return preco;
    }

    @Override
    public String obterDescricao() {
        return descricao;
    }
}
