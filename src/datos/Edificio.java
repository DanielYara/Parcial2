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
public class Edificio extends Inmueble{
    private ArrayList<Local> locales;
    private ArrayList<Piso> pisos;
    private Persona propietario;
    private int numPisosLibre;
    private int numLocalesLibre;
    private int aux;
    private int aux2;
    

    public Edificio(String barrio, int estrato, int valorArriendo, double areaConstruida, int numPisos, int numLocales) {
        super(barrio, estrato, valorArriendo, areaConstruida);
        this.propietario = propietario;
        this.locales = new ArrayList<>();
        this.pisos = new ArrayList<>();
        this.numPisosLibre = numPisos;
        this.numLocalesLibre = numLocales;
        this.aux = numLocales;
        this.aux2 = numPisos;
    }
    
    public boolean añadLocal(Local local){
       if(this.numLocalesLibre > 0 && this.numLocalesLibre < this.aux){
        this.numLocalesLibre--;
        return this.locales.add(local);
       } else
           return false;
    }
    
    public boolean elimLocal(Local local){
        if(this.numLocalesLibre >= 0 && this.numLocalesLibre < this.aux){
            this.numLocalesLibre++;
            return this.locales.remove(local);
        } else
            return false;
    }
    
    public boolean añadPiso(Piso piso){
        if(this.numPisosLibre > 0 && this.numPisosLibre < this.aux2){
        this.numPisosLibre--;
        return this.pisos.add(piso);
       } else
           return false;
    }
    
    public boolean elimPiso(Piso piso){
        if(this.numPisosLibre >= 0 && this.numPisosLibre < this.aux2){
            this.numPisosLibre++;
            return this.pisos.remove(piso);
        } else
            return false;
    }
    
    public String darPisosLocalesDisp(){
        return "Hay " + this.numLocalesLibre + " locales y " + this.numPisosLibre + " pisos disponibles";
    }

    @Override
    public String darInformacion() {
        String info1 = "Locales:\n";
        for(Local l : this.locales){
            info1 += l.darInformacion();
        }
        String info2 = "Pisos:\n";
        for(Piso p : this.pisos){
            info2 += p.darInformacion();
        }
        String informacion = "Propietario: " + propietario.getNombre() + ", " + info1 + "\n" + info2 + "\n" + super.toString();
        return informacion;
    }

    public ArrayList<Local> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<Local> locales) {
        this.locales = locales;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public int getNumPisosLibre() {
        return numPisosLibre;
    }

    public void setNumPisosLibre(int numPisosLibre) {
        this.numPisosLibre = numPisosLibre;
    }

    public int getNumLocalesLibre() {
        return numLocalesLibre;
    }

    public void setNumLocalesLibre(int numLocalesLibre) {
        this.numLocalesLibre = numLocalesLibre;
    }

    
    
    
}
