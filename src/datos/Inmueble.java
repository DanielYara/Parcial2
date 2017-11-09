/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public abstract class Inmueble {
    protected String barrio;
    protected int estrato;
    protected int valorArriendo;
    protected double areaConstruida;

    public Inmueble(String barrio, int estrato, int valorArriendo, double areaConstruida) {
        this.barrio = barrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
    }
    
    public abstract String darInformacion();

    @Override
    public String toString() {
        return "Inmueble{" + "barrio=" + barrio + ", estrato=" + estrato + ", valorArriendo=" + valorArriendo + ", areaConstruida=" + areaConstruida + '}';
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(int valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
    
    
    
}
