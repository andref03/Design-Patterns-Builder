package br.ifnmg.edu.designpatternsbuilder;

/**
 *
 * @author andref03
 */
public interface IBuilderCasa {
    void setQtddQuartos();
    void setQtddBanheiros();
    void setEstiloArquitetura();
    void setAreaTotal();
    void setExtras();
    Casa getCasa();
}
