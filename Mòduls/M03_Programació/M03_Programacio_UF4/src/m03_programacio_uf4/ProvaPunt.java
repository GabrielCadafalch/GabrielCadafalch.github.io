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
public class ProvaPunt {
    public static void main(String[] args) {
        Punt a = new Punt();
        a.set(4,3);
        
        Punt b = new Punt();
        b.set(5,-2);
        
        System.out.println("Punt a: " + a);
        
        a.suma(b);
        System.out.println("Punt a + Punt b: " + a);
        
        System.out.println("a es mes gran que b? " + a.esMesGran(b));
    }
}
