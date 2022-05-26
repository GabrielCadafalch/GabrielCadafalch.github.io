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
public class Punt {
    
    private double x;
    private double y;
    
    public void set (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double modul() {
        double modul = Math.sqrt((x*x)+(y+y));
        return modul;
    }
    public void imprimir() {
        System.out.println(toString());
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public void suma(Punt p){
        this.x = this.x + p.x;
        this.y = this.y + p.y;     
    }
    public Punt resta(Punt p){
        Punt q = new Punt();
        q.set(this.x - p.x, this.y - p.y);
        return q;
    }
    public boolean esMesGran(Punt p){
        return this.modul() > p.modul();
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
}
