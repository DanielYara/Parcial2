/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class FincaRaiz {
    private ArrayList<Inmueble> inmuebles;

    public FincaRaiz() {
        this.inmuebles = new ArrayList<>();
    }
    
    public void añadOficina(Oficina o){
        this.inmuebles.add(o);
    }
    
    public void añadLocal(Local l){
        this.inmuebles.add(l);
    }
    
    public void añadPiso(Piso p){
        this.inmuebles.add(p);
    }
    
    public void añadEdificio(Edificio ef){
        this.inmuebles.add(ef);
    }
    

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
    
}
