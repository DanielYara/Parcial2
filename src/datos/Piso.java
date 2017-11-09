/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Piso extends Inmueble{
    private ArrayList<Oficina> oficinas;
    private int numOficinas;

    public Piso(String barrio, int estrato, int valorArriendo, double areaConstruida) {
        super(barrio, estrato, valorArriendo, areaConstruida);
        this.oficinas = new ArrayList<>();
        this.numOficinas = this.oficinas.size();
    }
    
    public boolean añadOficinas(Oficina o){
        return this.oficinas.add(o);
    }
    
    public boolean elimOficina(Oficina o){
        return this.oficinas.remove(o);
    }

    @Override
    public String darInformacion() {
        String info = "";
        for(Oficina of : this.oficinas){
            info += of.darInformacion();
        }
        return "numero de Oficinas :" + this.numOficinas + ", " + info + "," + super.toString();
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }
    
    
    
}
