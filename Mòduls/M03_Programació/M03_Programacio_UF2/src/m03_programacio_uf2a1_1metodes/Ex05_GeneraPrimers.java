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
import java.util.Scanner;
public class Ex05_GeneraPrimers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //System.out.println("Introdueixi el total de nombres primers: ");
        final int totalPrimers = 100; //entrada.nextInt();
        entrada.close();
        
        int []primers = new int[totalPrimers];
        int valor = 2;
        int comptadorPrimers = 0;
        while(comptadorPrimers < totalPrimers)
        {
            if (esPrimer(valor))
            {
                primers[comptadorPrimers++] = valor;
            }
            valor++;
        }
        mostrarVector(primers);
    }
    public static boolean esPrimer(int nombre)
    { 
        boolean primer = true;
        for (int i = 2; i<=Math.sqrt(nombre);++i)
        {
            if (nombre % i == 0)
            {
                primer = false;
                break;
            }
        }
        return primer;
    }
    static void mostrarVector(int[] primers)
    {
        for (int i = 0; i < primers.length; ++i)
        {
            System.out.print(primers[i]);
            if (i == primers.length - 1)
                System.out.print(".\n");
            else
            if ((i+1) % 10 == 0 && i!= 0)
                System.out.printf(",\n");
            else
                System.out.print(", ");
        }
    }
}
