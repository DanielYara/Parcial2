/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaData;
import java.io.*;
import java.util.*;
import datos.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class CargaDatos {
    FincaRaiz fr;

    public CargaDatos() {
        fr = new FincaRaiz();
    }
    
    public String listarInmuebles(){
        String listaInmuebles = "";
        for(Inmueble i : fr.getInmuebles()){
            listaInmuebles += i.darInformacion();
        }
        return listaInmuebles;
    } 
    
    public void cargarDatos(String ruta){
        File lectura = new File(ruta);
        Scanner input = null;
        if(lectura.exists()){
            try{
                input = new Scanner(lectura);
                input.useDelimiter(",");
                String tipo = null;
                while(input.hasNext()){
                    tipo = input.next().trim();
                    if(tipo.equals("O")){
                        String barrio = input.next().trim();
                        String estrato = input.next().trim();
                        int e = Integer.parseInt(estrato);
                        String valorArriendo = input.next().trim();
                        int c = Integer.parseInt(valorArriendo);
                        String area = input.next().trim();
                        double a = Double.parseDouble(area);
                        String tip = input.next().trim();
                        Oficina o = new Oficina(barrio, e, c, a, tip);
                        fr.añadOficina(o);
                    } else if(tipo.equals("P")){
                        String barrio = input.next().trim();
                        String estrato = input.next().trim();
                        int e = Integer.parseInt(estrato);
                        String valorArriendo = input.next().trim();
                        int c = Integer.parseInt(valorArriendo);
                        String area = input.next().trim();
                        double a = Double.parseDouble(area);
                        Piso p = new Piso(barrio, e, c, a);
                        fr.añadPiso(p);
                    } else if(tipo.equals("E")){
                        String barrio = input.next().trim();
                        String estrato = input.next().trim();
                        int e = Integer.parseInt(estrato);
                        String valorArriendo = input.next().trim();
                        int c = Integer.parseInt(valorArriendo);
                        String area = input.next().trim();
                        double a = Double.parseDouble(area);
                        String numP = input.next().trim();
                        int p = Integer.parseInt(numP);
                        String numL = input.next().trim();
                        int l = Integer.parseInt(numL);
                        Edificio ed = new Edificio(barrio, e, c, a, p, l);
                        fr.añadEdificio(ed);
                    } else if(tipo.equals("L")){
                        String barrio = input.next().trim();
                        String estrato = input.next().trim();
                        int e = Integer.parseInt(estrato);
                        String valorArriendo = input.next().trim();
                        int c = Integer.parseInt(valorArriendo);
                        String area = input.next().trim();
                        double a = Double.parseDouble(area);
                        String descrip = input.next().trim();
                        String viaP = input.next().trim();
                        boolean t = Boolean.parseBoolean(viaP);
                        Local l = new Local(barrio, e, c, a, descrip, t);
                        fr.añadLocal(l);
                    }
                }
            } catch(FileNotFoundException e){
                Logger.getLogger(CargaDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    private static final Logger LOG = Logger.getLogger(CargaDatos.class.getName());
}
