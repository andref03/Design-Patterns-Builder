package br.ifnmg.edu.designpatternsbuilder;

/**
 *
 * @author andref03
 */
public class ConcreteCasa {

    private IBuilderCasa builder;

    public ConcreteCasa(IBuilderCasa builder) {
        this.builder = builder;
    }

    public void criarCasa() {
        builder.setQtddQuartos();
        builder.setQtddBanheiros();
        builder.setEstiloArquitetura();
        builder.setAreaTotal();
        builder.setExtras();
    }

    public Casa getCasa() {
        return builder.getCasa();
    }

}
