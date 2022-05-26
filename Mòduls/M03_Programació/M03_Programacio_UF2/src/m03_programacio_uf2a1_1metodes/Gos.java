/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_programacio_uf2a1_1metodes;

/**
 *
 * @author alumno
 */
public class Gos {
    int nombrePotes;
    String nom;
    String raca;
    enum Estat{MENJANT, DORMINT, BORDANT, DESPERT, CORRENT, JUGANT}
    Estat estat;
    Gos(){
    nombrePotes = 4;
    estat = Estat.CORRENT;
    }
    
    void mostrarPedigri(){
        System.out.println("Nom del gos: "+nom);
        System.out.println("Raca del "+nom+": "+raca);
        System.out.println(nom+" té "+nombrePotes+" potes");
    }
    
    void jugar(){
    
        if (estat == Estat.DORMINT)
            System.out.println(nom+" no pot jugar, està dormint.");
        else if (estat == Estat.JUGANT)
            System.out.println(nom+" ja estava jugant");
        else
        {
            System.out.println(nom+" s'ha posat a jugar.");
            estat = Estat.JUGANT;
        }
    }
    
    
}
