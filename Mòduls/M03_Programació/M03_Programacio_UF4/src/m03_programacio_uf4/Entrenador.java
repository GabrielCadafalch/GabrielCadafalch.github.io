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
public class Entrenador extends MiembroEquipo{
        
    private int idFederacion;
    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion){
        super(id,nombre,apellidos,edad);
        this.idFederacion = idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }
    public void dirigirPartido(){
        System.out.println(nombre+" esta dirigiendo un partido.");
    }
    public void dirigirEntrenamiento(){
        System.out.println(nombre+" esta dirigiendo un entrenamiento.");
    }
}
