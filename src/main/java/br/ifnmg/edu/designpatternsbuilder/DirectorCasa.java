package br.ifnmg.edu.designpatternsbuilder;

/**
 *
 * @author andref03
 */
public class DirectorCasa {

    private IBuilderCasa builder;

    public DirectorCasa(IBuilderCasa builder) {
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
