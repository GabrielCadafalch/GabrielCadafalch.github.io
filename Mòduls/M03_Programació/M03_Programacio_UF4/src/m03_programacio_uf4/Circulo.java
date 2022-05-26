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
public class Circulo extends FiguraGeometrica {
 
    
    private double radio;
    private Punt centro;
    
    
    public Circulo(double valor) {
        super("Circulo");
        System.out.println("Crida al constructor Circulo(double valor)");
        setRadio(valor);
        Punt punt = new Punt();
        punt.set(0, 0);
        this.centro = punt;
    }
    
    public Circulo(double valor,Punt centro) {
        super("Circulo");
        System.out.println("Crida al constructor Circulo(double valor,Punt centro)");
        setRadio(valor);
        this.centro = centro;
    }
    
    public Circulo(Circulo c) {
        super("Circulo");
        this.radio  = c.radio;
        this.centro = new Punt();
        Punt p = c.getCentro();
        this.centro.set(p.getX(),p.getY());
    }

    public double getRadio() {
        return radio;
    }

    public Punt getCentro() {
        return centro;
    }

    public void setRadio(double radio) {
        if (radio >= 0)
            this.radio = radio;
    }

    public void setCentro(Punt centro) {
        this.centro = centro;
    }

    

    
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    
    public double area() {
        return Math.PI*radio*radio;
    }
    
    
    /*public boolean mayorQue(Circulo otro) {
        return (this.radio > otro.radio);
    }*/
    
    /*public String toString() {
        return "Radio: " + this.radio;
    }*/
    
    public static double areaTotal(Circulo...c) {
                
        double total = 0;
        for (Circulo circulo : c)
            total += circulo.area();
        
        return total;        
    }
    

    
    
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(5);
        /*System.out.printf("Perímetro: %.2f\n", c1.perimetro());
        System.out.printf("Área     : %.2f\n" ,c1.area());*/
        
        /*Punt p = new Punt();
        p.set(5, -3);
        Circulo c2 = new Circulo(4.6,p);*/
        Circulo c2 = new Circulo(c1);
        
        //c2 = c1;
        c2.setRadio(6);
        System.out.println(c1);
        System.out.println(c2);
        //String esMayor = c1.mayorQue(c2) ? "SI" : "NO";
        
        
        /*String esMayor;
        if (c1.mayorQue(c2))
            esMayor = "SI";
        else
            esMayor = "NO";*/
        
        
        /*System.out.println("c1 es mayor que c2? " + esMayor);
        
        System.out.println("Centro de c1: " + c1.getCentro());
        System.out.println("Centro de c2: " + c2.getCentro());*/
        Circulo c3 = new Circulo(12);
        double areaTotal = Circulo.areaTotal(c1,c2,c3);
        System.out.println("Àrea total: " + areaTotal);
    }
}