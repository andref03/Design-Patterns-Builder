package br.ifnmg.edu.designpatternsbuilder;

/**
 *
 * @author andref03
 */
public class DesignPatternsBuilder {

    public static void main(String[] args) {
        
        // criando a casa do tipo Mansão
        ConcreteCasa builder = new ConcreteCasa(new BuilderMansao());
        builder.criarCasa();
        Casa mansion = builder.getCasa();
        System.out.println(">> Informacoes da Mansao:");
        mansion.infoCasa();
        
    }
}
