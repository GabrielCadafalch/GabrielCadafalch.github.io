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
//Exercici Sudoku Correcte Acepta El Reto
import java.util.Scanner;
public class Ex09_SudokuCorrecte {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Total de sudokus: ");
        int totalSudokus = entrada.nextInt();
        
        for (int numSudoku = 0; numSudoku < totalSudokus; ++numSudoku)
        {
            //Llegim sudoku per teclat
            int[][] sudoku = llegirSudoku();
            
            //Comprovem files i columnes
            boolean sudokuCorrecte = true;
            for (int i = 0; i < 9; ++i)
            {
                if(!esFilaValida(sudoku,i) || !esColumnaValida(sudoku,i))
                {
                    sudokuCorrecte = false;
                    break;
                }
            }
            
            //Comprovació de regions
            if (sudokuCorrecte)
                for (int fila = 0; fila < 9 && sudokuCorrecte; fila += 3)
                    for (int columna = 0; columna < 9 && sudokuCorrecte; columna += 3)
                        if (!esRegioValida(sudoku,fila,columna))
                            sudokuCorrecte = false;
            
            if (sudokuCorrecte)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
    static int[][] llegirSudoku()
    {
        int[][] sudoku = new int[9][9];
        for (int fila = 0; fila < 9; ++fila)
        {
            for (int columna = 0; columna < 9; ++columna)
                sudoku[fila][columna] = entrada.nextInt();
        }
        return sudoku;
    }
    
    static boolean esFilaValida(int[][] sudoku, int fila)
    {
        /*
        // Algorisme intuitiu però no eficient (36 comprovacions / pitjor cas)
        for (int columna = 0; columna < 8; ++columna)
        {
            for (int aux = columna+1; aux < 9; ++aux)
            {
                if (sudoku[fila][columna] == sudoku[fila][aux])
                {
                    return false;
                }
            }
        }
        return true;*/
        
        // Algorisme menys intuitiu més eficient (9 comprovacions / pitjor cas)
        int[] vectorAuxiliar = new int[9];
        
        for (int i = 0; i < 9; ++i)
        {
            if (vectorAuxiliar[sudoku[fila][i] - 1] == 1)
                return false;
            vectorAuxiliar[sudoku[fila][i] - 1] = 1;
        }
        return true;
    }
    static boolean esColumnaValida(int[][]sudoku, int columna)
    {
        int[] vectorAuxiliar = new int[9];
        
        for (int i = 0; i < 9; ++i)
        {
            if (vectorAuxiliar[sudoku[i][columna] - 1] == 1)
                return false;
            vectorAuxiliar[sudoku[i][columna] - 1] = 1;
        }
        return true;
    }
    static boolean esRegioValida(int[][]sudoku, int filaInicial, int columnaInicial)
    {
        int[] vectorAuxiliar = new int[9];
        
        for (int fila = filaInicial; fila < filaInicial+3; ++fila)
        {
            for (int col = columnaInicial; col < columnaInicial+3; ++col)
            {
                if (vectorAuxiliar[sudoku[fila][col] - 1] == 1)
                    return false;
                vectorAuxiliar[sudoku[fila][col] - 1] = 1;
            }
        }
        return true;
    }
}
