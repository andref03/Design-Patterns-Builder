package br.ifnmg.edu.designpatternsdecorator;

/**
 *
 * @author andref03
 */
public class ProdutoDesconto extends ProdutoDecorator {
    private final double desconto;

    public ProdutoDesconto(Produto produto, double desconto) {
        super(produto);
        this.desconto = desconto;
        System.out.println(">> Desconto aplicado (- R$ " + desconto + ")");
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() - desconto; // Aplica o desconto
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + " com desconto";
    }
}
