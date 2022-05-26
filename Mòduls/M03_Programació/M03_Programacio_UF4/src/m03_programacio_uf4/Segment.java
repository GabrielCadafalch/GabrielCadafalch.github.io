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
public class Segment {
    private Punt puntInicial;
    private Punt puntFinal;
    
    public void set(Punt a, Punt b) {
        puntInicial = a;
        puntFinal = b;
    }
    public double modul() {
        
        Punt p = puntFinal.resta(puntInicial);
        return p.modul();
    }
}
