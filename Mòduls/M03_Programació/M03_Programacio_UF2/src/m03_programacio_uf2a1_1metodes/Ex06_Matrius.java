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
public class Ex06_Matrius {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Anem a establir els paràmetres de la matriu: ");
        System.out.println("Files: ");
        int files = entrada.nextInt();
        System.out.println("Columnes: ");
        int columnes = entrada.nextInt();
        int [][] matriu = demanaMatriu(files,columnes);
        mostraMatriu(matriu);
        entrada.close();
    }
    public static void mostraMatriu (int[][] matriu)
    {
        for (int[] fila : matriu)
        {
            for (int valor : fila)
            {
                    System.out.print(valor+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static int[][] demanaMatriu (int files, int columnes)
    {
        System.out.println("Introdueix el valor mínim: ");
        int min = entrada.nextInt();
        
        System.out.println("Introdueix el valor màxim: ");
        int max = entrada.nextInt();
        
        int[][] matriu = generaMatriu(files,columnes,min,max);
        return matriu;
    }
    public static int[][] generaMatriu (int files, int columnes, int min, int max)
    {
        int [][] matriu = new int [files][columnes];
        for (int i = 0; i < files; ++i)
        {
            for (int j = 0; j < columnes; ++j)
            {
                    matriu[i][j] = (int) (Math.random()*(max+1-min))+min;
            }
        }
        return matriu;
    }
}
