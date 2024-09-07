package br.ifnmg.edu.designpatternsbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andref03
 */
public class Casa {

    private int qtddQuartos;
    private int qtddBanheiros;
    private String estiloArquitetura;
    private double areaTotal;
    private List<String> extras;

    public Casa() {
        extras = new ArrayList<>();
    }

    public int getQtddQuartos() {
        return qtddQuartos;
    }

    public void setQtddQuartos(int qtddQuartos) {
        this.qtddQuartos = qtddQuartos;
    }

    public int getQtddBanheiros() {
        return qtddBanheiros;
    }

    public void setQtddBanheiros(int qtddBanheiros) {
        this.qtddBanheiros = qtddBanheiros;
    }

    public String getEstiloArquitetura() {
        return estiloArquitetura;
    }

    public void setEstiloArquitetura(String estiloArquitetura) {
        this.estiloArquitetura = estiloArquitetura;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void addInExtras(String extra) {
        this.extras.add(extra);
    }

    public void infoCasa() {
        System.out.println("    > Numero de quartos: " + qtddQuartos);
        System.out.println("    > Numero de banheiros: " + qtddBanheiros);
        System.out.println("    > Estilo da arquitetura: " + estiloArquitetura);
        System.out.println("    > Area total: " + areaTotal + " unidades de area");
        System.out.println("    > Extras:");
        for (String extra : extras) {
            System.out.println("\t. " + extra);
        }
    }
}
