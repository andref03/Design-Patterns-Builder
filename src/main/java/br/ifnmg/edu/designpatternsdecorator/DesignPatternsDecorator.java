package br.ifnmg.edu.designpatternsdecorator;

/**
 *
 * @author andref03
 */
public class DesignPatternsDecorator {

    public static void main(String[] args) {
        
        Produto produto = new ProdutoBase("Laptop", 1500.00);
        
        // Exibe informações
        System.out.println("Descricao: " + produto.obterDescricao());
        System.out.println("Preco: " + produto.obterPreco());
        System.out.println();
        
        // Adiciona embalagem para presente
        Produto produtoComEmbalagem = new ProdutoEmbalado(produto);
        
        // Exibe informações
        System.out.println("Descricao: " + produtoComEmbalagem.obterDescricao());
        System.out.println("Preco: " + produtoComEmbalagem.obterPreco());
        System.out.println();
        
        // Adiciona desconto
        Produto produtoComDesconto = new ProdutoDesconto(produtoComEmbalagem, 100.00);
        
        // Exibe informações
        System.out.println("Descricao: " + produtoComDesconto.obterDescricao());
        System.out.println("Preco: " + produtoComDesconto.obterPreco());
        System.out.println();
        
    }
}
