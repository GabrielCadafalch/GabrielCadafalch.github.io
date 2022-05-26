/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
//https://www.codejava.net/java-se/graphics/convert-image-formats
import javax.imageio.ImageIO;
        try {
            FileInputStream is = new FileInputStream("foto.bmp");
            BufferedImage inputImage = ImageIO.read(is);
            FileOutputStream os = new FileOutputStream("foto.png");
            boolean result = ImageIO.write(inputImage,"bmp",os);
            
            is.close();
            os.close();
            
        } catch (FileNotFoundException fnf) {
        } catch (IOException ioe) {}
*/
/**
 *
 * @author rferrero
 */
public class EquipsFutbol {
    
    public static void main(String[] args) {
            
        
        
        // Fitxers de text
        // Lectura: 
        //          FileReader(nomFitxer) : flux
        //          BufferedReader(flux)  : filtre
        // Escriptura: 
        //          FileWriter(nomFitxer) : flux
        //          BufferedWriter(flux)  : filtre
        
        // Llegirem / escriurem línies de text
        
        // fitxerEntrada.readline()    -> llegeix una línia (String)
        // fitxerSortida.write(String) -> escriu línia
        
        try {
            
            //FileReader fr = new FileReader("resultats.txt");
            BufferedReader entrada = new BufferedReader(
                                new FileReader("resultats.txt"));
            
            //int totalPartits = Integer.parseInt(entrada.readLine());
            //System.out.println("Total partits: " + totalPartits);
            
            final int totalPartits = 4;
            String[] equips = new String[totalPartits*2];
            int[] puntuacio = new int[totalPartits*2];
            
            //for (int i = 0; i < totalPartits; ++i) {
            String partit;
            int i = 0;
            
            while((partit = entrada.readLine()) != null) {               
                //System.out.println(partit);
                equips[i*2] = partit.split("-")[0].split(":")[0];
                int golsEquip1 = Integer.parseInt(
                                 partit.split("-")[0].split(":")[1]);
                
                equips[2*i+1] = partit.split("-")[1].split(":")[0];
                int golsEquip2 = Integer.parseInt(
                                 partit.split("-")[1].split(":")[1]);
                
                if (golsEquip1 > golsEquip2)
                    puntuacio[i*2] += 3;
                else if (golsEquip1 < golsEquip2)
                    puntuacio[i*2+1] += 3;
                else {
                    puntuacio[i*2]   += 1;
                    puntuacio[i*2+1] += 1; 
                }
                ++i;
                
                System.out.println();
            }
            entrada.close();
            
            // Abans d'ordenar
            mostrarClassificacions(equips,puntuacio);
            
            // Fem ordenació
            ordenacio(equips,puntuacio);

            // Classificació final
            System.out.println("\n\n*** Classificació final ***");
            mostrarClassificacions(equips,puntuacio);
            
            // Salvem la classificació en un fixter
            BufferedWriter sortida = new BufferedWriter(
                                new FileWriter("classificacio.txt"));
            
            for (i = 0; i < equips.length; ++i)
                sortida.write(equips[i] + ":" + puntuacio[i] + "\n");
            
            sortida.close();
        
                   

        } catch (FileNotFoundException fnf) {
            //fnf.printStackTrace();
            System.out.println("Error fitxer no trobat.");
        } catch (IOException ioe) {
            System.out.println("Error I/O: " + ioe.getMessage());
        }

       
    }
    
    
    static void ordenacio(String[] equips,int[] puntuacions) {
        
        for (int i = 0; i < puntuacions.length; ++i) {
            for (int j = 0; j < puntuacions.length - i -1;++j) {
                if (puntuacions[j] < puntuacions[j+1]) {
                    int aux = puntuacions[j];
                    puntuacions[j] = puntuacions[j+1];
                    puntuacions[j+1] = aux;
                    String aux2 = equips[j];
                    equips[j] = equips[j+1];
                    equips[j+1] = aux2;
                }
            }
        }
        
    }
            
            
    static void mostrarClassificacions(String[] equips,int[] puntuacions) {
                
        for (int i = 0; i < equips.length; ++i) {
            System.out.println(equips[i] + ":" + puntuacions[i]);
        
        }        
    }
            
            
    
    static void metodo() throws FileNotFoundException{
        
        //try {
            
            FileReader fr = new FileReader("resultats.txt");
            
        //} catch (FileNotFoundException fnf) {
            //fnf.printStackTrace();
        //    System.out.println("Error: " + fnf.getMessage());
        //}
        
    }
}
