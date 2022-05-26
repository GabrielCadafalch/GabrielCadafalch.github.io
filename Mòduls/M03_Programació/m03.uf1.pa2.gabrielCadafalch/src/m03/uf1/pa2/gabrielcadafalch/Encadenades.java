/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.pa2.gabrielcadafalch;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Encadenades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix una llista de paraules encadenades");
        String frase = entrada.nextLine();
        entrada.close();
        
        String[] paraules = frase.split(" ");
        boolean esEncadenat = false;
        for (int i = 0; i < paraules.length-1; ++i)
        {
            char a  = paraules[i+1].charAt(0);
            char b = paraules[i].charAt(paraules[i].length()-1);
            
            esEncadenat = a == b;
            /*if (!esEncadenat)
                break;*/
        }
        if (esEncadenat)
            System.out.println("Si és una llista de paraules encadenades");
        else
            System.out.println("No és una llista de paraules encadenades");
    }
}
