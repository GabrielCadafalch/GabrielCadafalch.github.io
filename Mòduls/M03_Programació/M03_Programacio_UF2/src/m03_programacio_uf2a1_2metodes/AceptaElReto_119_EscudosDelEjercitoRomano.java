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
public class AceptaElReto_119_EscudosDelEjercitoRomano {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int legionaris = 1;
        while((legionaris = entrada.nextInt())!=0 && legionaris <= Math.pow(10,7)){
            int total = 0;
            int i = legionaris;
            //int escuts = 0;
            while(legionaris>0){
                /*
                
                int costat = (int) Math.sqrt(legionaris);
                escuts += nombreEscuts(costat);
                legionaris = legionaris - costat*costat;
                */
                if (legionaris-(i*i)>=0)
                {
                    legionaris-=(i*i);
                    total += nombreEscuts(i);
                }
                    --i;
            }
            System.out.println(total);
        }
    }
    static int nombreEscuts(int n)
    {
        return n*n+4*n;
    }
}
