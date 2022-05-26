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
public class Racional {
    private int numerador;
    private int denominador;
    
    public void set(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void setNumerador(int x) {
        numerador = x;
    }
    public void setDenominador (int y) {
        denominador = y;
    }
    public void imprimir() {
        System.out.println(numerador + "/" + denominador);
    }
    public void producte(Racional r) {
        numerador = numerador * r.numerador;
        denominador = denominador * r.denominador;
    }
    public void sumar(Racional r) {
        numerador = r.denominador * numerador + denominador * r.numerador;
        denominador *= r.denominador;
    }
    private int mcd (int m, int n) {
        if (m != 0 && n != 0)
        {
            while (n != 0)
            {
                int aux = n;
                n = m % n;
                m = aux;
            }
        }
        else
            m = (m == 0) ? n : m;
        return m;
    }
    public void simplificar (Racional r){
        numerador /= mcd(numerador,denominador);
        denominador /= mcd(numerador,denominador);
    }
}