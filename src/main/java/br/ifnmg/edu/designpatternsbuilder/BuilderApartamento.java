package br.ifnmg.edu.designpatternsbuilder;

/**
 *
 * @author andref03
 */
public class BuilderApartamento implements IBuilderCasa {

    private Casa casa = new Casa();

    @Override
    public void setQtddQuartos() {
        casa.setQtddQuartos(2);
    }

    @Override
    public void setQtddBanheiros() {
        casa.setQtddBanheiros(2);
    }

    @Override
    public void setEstiloArquitetura() {
        casa.setEstiloArquitetura("Contemporaneo");
    }

    @Override
    public void setAreaTotal() {
        casa.setAreaTotal(100);
    }

    @Override
    public void setExtras() {
        casa.addInExtras("Sacada");
        casa.addInExtras("Estacionamento no subsolo");
        casa.addInExtras("Jardim compartilhado");
        casa.addInExtras("Sistema de seguranca basico");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }

}
