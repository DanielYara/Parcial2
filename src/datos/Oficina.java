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
public class Oficina extends Inmueble{
    private String tipo;

    public Oficina(String barrio, int estrato, int valorArriendo, double areaConstruida, String tipo) {
        super(barrio, estrato, valorArriendo, areaConstruida);
        this.tipo = tipo;
    }

    @Override
    public String darInformacion() {
        return this.tipo + ", " + super.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
