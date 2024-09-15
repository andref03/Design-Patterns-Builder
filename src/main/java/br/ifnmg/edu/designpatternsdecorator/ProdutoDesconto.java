package br.ifnmg.edu.designpatternsdecorator;

/**
 * Esta classe tem o objetivo de aplicar um determinado desconto para o objeto
 * do tipo Produto.
 * 
 * @author andref03
 */
public class ProdutoDesconto extends ProdutoDecorator {
    
    private final double desconto;

    public ProdutoDesconto(Produto produto, double desconto) {
        super(produto);
        this.desconto = desconto;
        System.out.println(">> Desconto aplicado (- R$ " + this.desconto + ")");
    }

    @Override
    public double obterPreco() {
        // aplicando o desconto
        return super.obterPreco() - desconto;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + " com desconto";
    }
}
