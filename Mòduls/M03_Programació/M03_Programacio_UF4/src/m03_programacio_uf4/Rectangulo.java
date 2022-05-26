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
public class Rectangulo extends FiguraGeometrica {
    
    private double amplada;
    private double alcada;
    
    public Rectangulo() {
        super("Rectangulo");
        amplada = 0;
        alcada  = 0;
    }
    
    public Rectangulo(double amplada,double alcada) {
        super("Rectangulo");
        this.amplada = amplada;
        this.alcada  = alcada;        
    }
    
    
    public double area() {
        return amplada * alcada;
    }
}
