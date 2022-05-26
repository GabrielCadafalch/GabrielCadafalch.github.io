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
public class ProvaRacional {
    public static void main(String[] args) {
        Racional r1 = new Racional();
        r1.set(1,6);
        r1.imprimir();
        //r1.setDenominador(5);
        //r1.imprimir();
        Racional r2 = new Racional();
        r2.set(3,12);
        r1.sumar(r2);
        r1.simplificar(r1);
        r1.imprimir();
    }
}
