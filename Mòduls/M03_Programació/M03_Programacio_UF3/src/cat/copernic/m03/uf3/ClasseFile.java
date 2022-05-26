/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cat.copernic.m03.uf3;

import java.io.File;

/**
 *
 * @author rferrero
 */
public class ClasseFile {
 
    public static void main(String[] args) {
        
        // Linux
        //File fitxer = new File("/home/rferrero/uf3/fitxer.txt");
        File fitxer = new File("dades/fitxer.txt");
        // Mac
        //File fitxer = new File("/Users/rferrero/fitxer.txt");
        // Windows
        //File fitxer = new File("c:/Users/rferrero/uf3/fitxer.txt");
        if (fitxer.exists())
        {
            if (fitxer.isDirectory())
                System.out.println("És una carpeta");
            else
                System.out.println("És un fitxer.");
            
            System.out.println("El fixer existeix");
            System.out.println("Nom del fitxer: " + fitxer.getName());
            System.out.println("Ruta absoluta: " + fitxer.getAbsolutePath());
            System.out.println("getPath(): " + fitxer.getPath());
            if (fitxer.canRead())
                System.out.println("El fitxer es pot llegir");
            else
                System.out.println("El fitxer NO es pot llegir");
            
            if (fitxer.canWrite())
                System.out.println("El fitxer es pot modificar");
            else
                System.out.println("El fitxer NO es pot modificar");
            
            System.out.println("La longitud del fitxer és: " + fitxer.length());
            
            
        }
        else
            System.out.println("El fixer no existeix");
     
        
        for (File f : File.listRoots())
            System.out.println("Carpeta arrel:" + f.getAbsolutePath());
        
    }
}
