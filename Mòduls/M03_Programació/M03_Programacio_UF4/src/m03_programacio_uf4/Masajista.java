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
public class Masajista extends MiembroEquipo {
    
    private int anosExperiencia;
    private String titulacion;
    
    public Masajista(int id, String nombre, String apellidos, int edad, int anosExperiencia, String titulacion){
        super(id,nombre,apellidos,edad);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }
    public void darMasaje(){
        System.out.println(nombre+" esta dando un masaje.");
    }
}
