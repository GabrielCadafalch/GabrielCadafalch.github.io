/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



/*
Binari: 
        Lectura    -> FileInputStream
                       mètode: read() -> llegeix 1 byte (int)
                               read(array de bytes)

        Escriptura -> FileOutputStream 
                       mètode: write(array de bytes)
*/
/**
 *
 * @author rferrero
 */
public class FitxersBinaris {
    
    public static void main(String[] args) {
        
        try {
            FileInputStream entrada = 
                         new FileInputStream("imatges/kitten.bmp");
            
            /*
            for (int i = 0; i < 16; ++i) {
                int valor = entrada.read();
                String repr = "0" + Integer.toHexString(valor);
                System.out.print(repr.substring(repr.length()-2));
                System.out.print(" ");
            }
            System.out.println("");*/
            
            int mida = entrada.available();
            
            //byte[] buffer = entrada.readAllBytes();
            byte[] buffer = new byte[mida];
            entrada.read(buffer);
            entrada.close();
            
            for (int i = 0; i < buffer.length; ++i) {
                
                String repr = "0" + Integer.toHexString(buffer[i]);
                System.out.print(repr.substring(repr.length()-2));
                System.out.print(" ");
                
                if (i % 16 == 0 && i != 0)
                    System.out.println("");                
            }
        
        
            // Escriptura
            FileOutputStream sortida = 
                             new FileOutputStream("imatges/kitten_copia.bmp");
            
            buffer[1000] = 0x6B;
            buffer[1001] = (byte)0b10100010;
            buffer[1002] = 39;
            
            sortida.write(buffer);
            sortida.close();
        
        } catch (FileNotFoundException fnf) {
            //fnf.printStackTrace();
            System.out.println("Error fitxer no trobat.");
        } catch (IOException ioe) {
            System.out.println("Error I/O: " + ioe.getMessage());
        }
        
    }
}
