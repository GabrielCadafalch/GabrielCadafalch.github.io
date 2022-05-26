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
public abstract class FiguraGeometrica {
    enum Color {BLANC,NEGRE,VERMELL,BLAU,VERD,GROC};
    private String nombre;
    private Color color;
    
    abstract public double area();
    
    public FiguraGeometrica(String nombreFigura) {
        this.nombre = nombreFigura;
        this.color = Color.NEGRE;
    }
    
    final public boolean mayorQue(FiguraGeometrica otra) {
        return area() > otra.area();
    }
    
    @Override
    final public String toString() {
        return this.nombre + " con area " + area();
    }
    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }
}
