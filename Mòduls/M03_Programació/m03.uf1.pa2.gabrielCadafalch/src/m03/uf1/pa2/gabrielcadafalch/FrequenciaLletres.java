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
public class FrequenciaLletres {
    public static void main(String[] args) {
        System.out.println("Introdueix una frase");
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine().toUpperCase();
        entrada.close();
        String caracters = "ABCÇDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] comptador = new int[caracters.length()];
        
        for (int i  = 0; i < caracters.length(); ++i)
        {
            char lletraValida = caracters.charAt(i);
            for (int j  = 0; j < frase.length(); ++j)
            {
                char lletra = frase.charAt(j);
                if (lletra == lletraValida)
                {
                    comptador[i]++;
                }
            }
        }
        for (int i = 0; i < caracters.length(); i++)
        {
            if (comptador[i] > 0)
                System.out.println(caracters.charAt(i)+": "+comptador[i]);
        }
    }
}
