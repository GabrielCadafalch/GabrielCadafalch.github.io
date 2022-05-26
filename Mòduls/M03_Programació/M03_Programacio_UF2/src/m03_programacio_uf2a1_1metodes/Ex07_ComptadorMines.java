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
public class Ex07_ComptadorMines {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] camp =  Ex06_Matrius.generaMatriu(3, 4, -1, 0);
        System.out.println("Matriu entrada: ");
        Ex06_Matrius.mostraMatriu(camp);
        System.out.println("Matriu sortida: ");
        comptaMines(camp);
    }
    public static int[][] comptaMines(int[][] camp)
    {
        int files = 3;
        int columnes = 4;
        
        for (int fila = 0; fila < files; ++fila)
        {
            for (int columna = 0; columna < columnes; ++columna)
            {
                camp[fila][columna] = sumaMines(camp,fila,columna);
            }
        }
        Ex06_Matrius.mostraMatriu(camp);
        return null;
    }
    static int sumaMines (int[][] campMines, int fila, int columna)
    {
        int sumaMines = 0;
        for (int i = fila - 1; i <= fila+1; ++i)
        {
            if (i == -1 || i == 3)
                continue;
            for (int j = columna-1; j <= columna+1; ++j)
            {
                if (j == -1 || j == 4)
                    continue;
                if (campMines[fila][columna] == -1)
                {
                    sumaMines = -1;
                    break;
                }
                if (campMines[i][j] == -1)
                    sumaMines++;
            }
        }
        /*
        for (int incFila = -1; incFila <= 1; incFila++)
        {
            for (int incCol = -1; incCol <= 1; ++incCol)
            {
                if (fila + incFila >= 0 && fila + incFila < campMines.length &&
                    columna + incCol >= 0 && columna + incCol < campMines[0].length
                    campMines[fila+incFila][columna+incCol])
            }
        }
        */
        return sumaMines;
    }
}
