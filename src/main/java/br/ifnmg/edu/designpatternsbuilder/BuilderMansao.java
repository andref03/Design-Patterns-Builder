package br.ifnmg.edu.designpatternsbuilder;

/**
 *
 * @author andref03
 */
public class BuilderMansao implements IBuilderCasa {

    private Casa casa = new Casa();
    
    @Override
    public void setQtddQuartos() {
        casa.setQtddQuartos(5);
    }

    @Override
    public void setQtddBanheiros() {
        casa.setQtddBanheiros(6);
    }

    @Override
    public void setEstiloArquitetura() {
        casa.setEstiloArquitetura("Moderno");
    }

    @Override
    public void setAreaTotal() {
        casa.setAreaTotal(500);
    }

    @Override
    public void setExtras() {
        casa.addInExtras("Piscina");
        casa.addInExtras("Jardim");
        casa.addInExtras("Garagem para 4 carros");
        casa.addInExtras("Elevado sistema de segurança");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }

}
