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
public class Ex08_PedraPaperTisoresLlangardaixSpock {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {
        String[] opcions = {"pedra","paper","tisores","llangardaix","Spock"};
        int[][] matriuGuanyador = {
            {0,-1,1,1,-1},
            {1,0,-1,-1,1},
            {-1,1,0,1,-1},
            {-1,1,-1,0,1},
            {1,-1,1,-1,0}
        };
        int marcadorJugador = 0, marcadorOrdinador = 0;
        while (marcadorJugador <= 3 && marcadorOrdinador <= 3)
        {
            for (int i = 1;; ++i)
            {
                System.out.printf("Ronda: %d [Jugador: %d - Ordinador: %d]\n"
                        ,i,marcadorJugador,marcadorOrdinador);
                opcions();
                int a = jugadaHuma();
                System.out.print("El jugador ha tret "+opcions[a]+". ");
                System.out.print("L'ordinador ha tret "+opcions[jugadaOrdinador()]+". ");
                switch (matriuGuanyador[a][jugadaOrdinador()]) {
                    case 1: 
                        System.out.print("Guanya el jugador!! \n");
                        marcadorJugador++;
                        System.out.println("");
                        break;
                    case 0:
                        System.out.print("Empat. \n");
                        System.out.println("");
                        break;
                    case -1:
                        System.out.print("Guanya l'ordinador!! \n");
                        marcadorOrdinador++;
                        System.out.println("");
                        break;
                    default:
                        break;
                }
                if (marcadorJugador == 3 || marcadorOrdinador == 3)
                {
                    System.out.println("La partida ha acabat en "+i+" rondes.");
                    break;
                }
            }
            System.out.println("El marcador ha estat: ");
            System.out.printf("Jugador: %d - Ordinador: %d\n",marcadorJugador,marcadorOrdinador);
            break;
        }
    }
    static int jugadaHuma()
    {
        int a = entrada.nextInt();
        return a;
    }
    static int jugadaOrdinador()
    {
        int min = 0, max = 4;
        return (int) (Math.random()*(max+1-min))+min;
    }
    static void opcions()
    {
        String[] opcions = {"pedra","paper","tisores","llangardaix","Spock"};
        for (int i = 0; i <= 4; ++i)
        {
            if (i != 4)
            System.out.print(opcions[i]+"("+i+")"+", ");
            else
            {
                System.out.print(opcions[i]+"("+i+")"+": ");
                System.out.println("");
            }
        }
    }
        static void opcionsInt(int i)
    {
        String[] opcions = {"pedra","paper","tisores","llangardaix","Spock"};
        for (i = 0; i <= 4; ++i)
        {
            if (i != 4)
            System.out.print(opcions[i]+"("+i+")"+", ");
            else
            {
                System.out.print(opcions[i]+"("+i+")"+": ");
                System.out.println("");
            }
        }
    }
}
