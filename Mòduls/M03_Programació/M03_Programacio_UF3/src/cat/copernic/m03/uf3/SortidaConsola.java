/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author rferrero
 */
public class SortidaConsola {
    
    public static void main(String[] args) {
        
        /*int valor = 5;
        System.out.print("Hola");
        System.out.print(" Adeu: ");
        System.out.println(valor);
        */
        
        /*
        for (int i = 1; i <= 10;++i) {
            System.out.println("3x" + i + " = " + (3*i));
        }
        */  
        
        try {
            BufferedWriter sortida = new BufferedWriter (
                                         new OutputStreamWriter(System.out));

            for (int i = 1; i <= 10;++i) {
                String cadena = "3x" + i + " = " + (3*i) + "\n";
                sortida.write(cadena,0,cadena.length());
            }
            
            sortida.flush();
            
        } catch (IOException e) {}
        
        
    }
}
