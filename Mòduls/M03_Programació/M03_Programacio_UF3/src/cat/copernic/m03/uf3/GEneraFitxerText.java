/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class GEneraFitxerText {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            //FileWriter flux = new FileWriter("agenda.txt");
            BufferedWriter fitxer = new BufferedWriter(
                                                 new FileWriter("agenda.txt"));
            
            String nom = "";
            do {
                System.out.print("Introdueix un nom: ");
                nom = sc.nextLine();
                if (!nom.equals("")) {
                    System.out.print("Introdueix el telèfon: ");
                    String telefon = sc.nextLine();
                    fitxer.write(nom + "," + telefon);
                    fitxer.newLine();
                }
            } while(!nom.equals(""));
            
            fitxer.close();  // Tanca el fitxer
            
        } catch (IOException e) {
            System.out.println("S'ha produit un error al fitxer:");
            System.out.println(e.getMessage());
        }                
        
    }
}
