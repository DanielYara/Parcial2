/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;
import CargaData.*;
import datos.*;

/**
 *
 * @author Estudiante
 */
public class Parcial2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CargaDatos cr = new CargaDatos();
        cr.cargarDatos("datos.csv");
        String t = cr.listarInmuebles();
        System.out.println(t);
    }
    
}
