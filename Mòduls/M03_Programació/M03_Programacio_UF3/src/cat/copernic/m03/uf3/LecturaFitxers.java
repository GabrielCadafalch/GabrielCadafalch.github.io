/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rferrero
 */
public class LecturaFitxers {
    
    public static void main(String[] args) {
        
        try {
            BufferedReader fitxer = new BufferedReader(
                                            new FileReader("agenda.txt"));

            System.out.println("Sóc l'ECO");
            String text = "";
            
            do {
                text = fitxer.readLine();
                if (text != null && !text.equals(""))
                    System.out.println(text);  
            } while (text != null && !text.equals(""));
            
            fitxer.close();
            
        } catch (IOException e) {
            System.out.println("Error en llegir l'entrada estàndard");
            System.out.println(e.getMessage());
        }
    }    
}
