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
public class MatriuTransposada {
    static final int DIMENSIO = 4;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        int[][]matriu = new int [DIMENSIO][DIMENSIO];
        int[][]transposada = new int [DIMENSIO][DIMENSIO];
        
        int traca = 0;
        for (int i = 0; i<DIMENSIO; ++i)
        {
            for (int j = 0; j<DIMENSIO; ++j)
            {
                matriu[i][j] = entrada.nextInt();
                transposada[j][i] = matriu[i][j];
                if (i == j)
                    traca += matriu[i][j];
            }
        }
        
        entrada.close();
        mostraMatriu(matriu);

        System.out.println("");
        System.out.println("Traça: "+traca);
        System.out.println("");
        System.out.println("Matriu transposada: ");
        
        mostraMatriu(transposada);
    }
    static void mostraMatriu(int[][] m){
        for (int i = 0; i<DIMENSIO; ++i)
        {
            for (int j = 0; j<DIMENSIO; ++j)
            {
                if (j == DIMENSIO-1)
                {
                    System.out.print(m[j][i]+"\n");
                }
                else 
                    System.out.print(m[j][i]+"\t");
            }
        }
    }
}
