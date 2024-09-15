package br.ifnmg.edu.designpatternsdecorator;

/**
 *
 * @author andref03
 */
public class DesignPatternsDecorator {

    public static void main(String[] args) {
        
        Produto produto = new ProdutoBase("Laptop", 1500.00);
        
        // saída original
        System.out.println("Descricao: " + produto.obterDescricao());
        System.out.println("Preco: " + produto.obterPreco());
        System.out.println();
        
        // adicionando a embalagem para presente
        Produto produtoComEmbalagem = new ProdutoEmbalado(produto);
        
        // saída após aplicar a embalagem
        System.out.println("Descricao: " + produtoComEmbalagem.obterDescricao());
        System.out.println("Preco: " + produtoComEmbalagem.obterPreco());
        System.out.println();
        
        // adicionando desconto ao produto
        Produto produtoComDesconto = new ProdutoDesconto(produtoComEmbalagem, 100.00);
        
        // saída após aplicar o desconto no produto em que já havia sido aplicado a embalagem
        System.out.println("Descricao: " + produtoComDesconto.obterDescricao());
        System.out.println("Preco: " + produtoComDesconto.obterPreco());
        System.out.println();
        
    }
}
