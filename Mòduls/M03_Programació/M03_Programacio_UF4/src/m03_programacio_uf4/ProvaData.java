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
public class ProvaData {
    public static void main(String[] args) {
        Data a = new Data();
        a.setData(12,12,2001);
        
        System.out.println(" Data 1: "+ a.getData());
        System.out.println("Es primer de mes? " + a.esPrimerDeMes());
        
        Data b = new Data();
        b.setData(1,1,1914);
        System.out.println("Data 2: " + b.getData());
        System.out.println("Es primer de mes? " + b.esPrimerDeMes());
        
        System.out.println("Data 1 es anterior a Data 2? " + a.esAnterior(b));
        System.out.println("Data 1 es any de traspas? " + a.esAnyDeTraspas());
    }
}
