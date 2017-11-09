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
public class Local extends Inmueble{
    private String descripcion;
    private boolean viaPrincipal;

    public Local(String barrio, int estrato, int valorArriendo, double areaConstruida, String descripcion, boolean viaPrincipal) {
        super(barrio, estrato, valorArriendo, areaConstruida);
        this.descripcion = descripcion;
        this.viaPrincipal = viaPrincipal;
    }

    @Override
    public String darInformacion() {
        if(viaPrincipal)
            return this.descripcion + ", ubicado en una via principal, " + super.toString();
        else
            return this.descripcion + ", " + super.toString();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isViaPrincipal() {
        return viaPrincipal;
    }

    public void setViaPrincipal(boolean viaPrincipal) {
        this.viaPrincipal = viaPrincipal;
    }
    
    
}
