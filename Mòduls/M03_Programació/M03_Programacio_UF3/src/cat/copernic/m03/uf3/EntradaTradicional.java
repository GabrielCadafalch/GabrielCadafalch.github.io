/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/

import java.io.*;

/**
 *
 * @author rferrero
 */
public class EntradaTradicional {
    
    public static void main(String[] args) {
        
        BufferedReader teclat = new BufferedReader(
                                        new InputStreamReader(System.in));
        
        System.out.println("Sóc l'ECO");
        String text;
        try {
            while (!(text = teclat.readLine()).equals(""))
                System.out.println(text);            
        } catch (IOException e) {
            System.out.println("Error en llegir l'entrada estàndard");
        }
    }
}
