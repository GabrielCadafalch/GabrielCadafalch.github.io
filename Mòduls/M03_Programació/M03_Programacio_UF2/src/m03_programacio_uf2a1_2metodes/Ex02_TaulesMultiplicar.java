/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_programacio_uf2a1_2metodes;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ex02_TaulesMultiplicar {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quantes taules vols mostrar? ");
        int valor = entrada.nextInt();
        for (int i = 1; i <= 10; ++i)
        {
            System.out.println(muntarLiniaPantalla(i,1,valor));
        }
        System.out.println("");
        
    }
    static String liniaTaulaMultiplicar (int n, int taula)
    {
        //"1 x 1 =  1";
        //taula es la taula de multiplicar
        //n es el numero per el que es multiplica
        return String.format("%d x %2d = %2d", taula,n,taula*n);
    }
    static String muntarLiniaPantalla(int n, int taulaInicial, int taulaFinal)
    {
        //"1 x 1 =  1    2 x 1 =  2 ..."
        //n es el numero per el que es multiplica
        //taula inicial es 1 i cada 4 + 1 
        //taula final es 4 i multiples
        String liniaPantalla="";
        for (int taula = taulaInicial; taula <= taulaFinal; ++taula)
        {
            liniaPantalla += liniaTaulaMultiplicar(n,taula)+"\t";
        }
        return liniaPantalla;
    }
}
