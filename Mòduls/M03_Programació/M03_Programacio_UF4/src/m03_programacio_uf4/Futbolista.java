/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_programacio_uf4;

/**
 *
 * @author alumno
 */
public class Futbolista extends MiembroEquipo{
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion){
        super(id,nombre,apellidos,edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public void jugarPartido(){
        System.out.println(nombre+"esta jugando un partido.");
    }
    public void entrenar(){
        System.out.println(nombre+" esta entrenando.");
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
    
}
