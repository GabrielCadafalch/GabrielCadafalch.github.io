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
import java.util.Locale;
public class Fruiteria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indiqui els articles i el pes (línia en blanc per finalitzar):");
        String[] llista = {"taronja","poma","pera","mandarina","maduixa","platan"};
        
        double[] preus = {1.55,1.99,2.40,1.80,5.00,2.20}; //new double [llista.length];
        /*preus[0] = 1.55; preus[1] = 1.99; preus[2] = 2.40;
        //preus[3] = 1.80; preus[4] = 5.00; preus[5] = 2.20;*/
        boolean entradaValida = false;
        
        double preuTotal = 0.0;
        int j = 0;
        System.out.println("Article: ");
        String producte = entrada.nextLine();        
        while(!producte.equals(""))
        {
            if (!entradaValida){
                for (int i = 0; i < llista.length; ++i)
                {
                    if (producte.equals(llista[i]))
                    {
                        entradaValida = true;
                        j = i;
                        break;
                    }
                }
            }
            if (entradaValida)
            {
                System.out.println("Pes: ");
                double pes = entrada.nextDouble();
                preuTotal += pes*preus[j];
                entrada.nextLine();
            }
            if (!entradaValida){       
                System.out.println("ERROR, article no disponible");
            }
            entradaValida = false;
            System.out.println("Article: ");
            producte = entrada.nextLine();
        }
        
        System.out.println("");
        System.out.printf("Total: %.2f€\n",preuTotal);
    }
}