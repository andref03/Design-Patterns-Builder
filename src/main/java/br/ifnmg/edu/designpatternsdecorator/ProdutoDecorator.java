package br.ifnmg.edu.designpatternsdecorator;

/**
 *
 * @author andref03
 */
public class ProdutoDecorator implements Produto {
    
    protected final Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    @Override
    public double obterPreco() {
        return produto.obterPreco();
    }

    @Override
    public String obterDescricao() {
        return produto.obterDescricao();
    }
}
