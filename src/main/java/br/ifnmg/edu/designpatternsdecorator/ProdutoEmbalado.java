package br.ifnmg.edu.designpatternsdecorator;

/**
 *
 * @author andref03
 */
public class ProdutoEmbalado extends ProdutoDecorator {
     
    public ProdutoEmbalado(Produto produto) {
        super(produto);
        System.out.println(">> Embalagem aplicada (+ R$ 10,00)");
    }

    @Override
    public double obterPreco() {
        // o valor da embalagem é fixado em R$ 10,00
        return super.obterPreco() + 10.0;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + " com embalagem para presente";
    }
}
