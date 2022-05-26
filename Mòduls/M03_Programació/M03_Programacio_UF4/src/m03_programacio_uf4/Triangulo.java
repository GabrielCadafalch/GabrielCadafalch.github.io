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
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double alcada;
    
    public Triangulo(double base, double alcada){
        super("Triangulo");
        this.base = base;
        this.alcada = alcada;
    }
    
    public double area(){
        return this.base * this.alcada/2;
    }
}
