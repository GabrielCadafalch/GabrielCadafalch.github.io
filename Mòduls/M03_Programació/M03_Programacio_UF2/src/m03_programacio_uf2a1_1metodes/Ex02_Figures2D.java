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
import java.util.Locale;
import java.util.Scanner;
public class Ex02_Figures2D {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        mostrarOpcions();
        String figura = entrada.nextLine();        
        while (!figura.equals("0")){
            switch (figura)
            {
                case "1":
                    quadrat ();
                    break;
                case "2":
                    rectangle ();
                    break;
                case "3":
                    isosceles();
                    break;
                case "4":
                    cercle();
                    break;
                default:
                    System.out.println("ERROR");
                    entrada.nextLine();
                    break;
            }
            figura = entrada.nextLine();
        }
    }
    static void mostrarOpcions()
    {
        System.out.println("Introdueix una figura:");
        System.out.println("1 - Quadrat");
        System.out.println("2 - Rectangle");
        System.out.println("3 - Triangle isòsceles");
        System.out.println("4 - Cercle");
        System.out.println("0 - Sortir");
    }
    
    static void quadrat()
    {
        System.out.println("Introdueix la mida del costat del quadrat: ");
        double n = entrada.nextDouble();
        double area = n*n;
        double peri=4*n;
        mostrarResultat(peri,area);
        entrada.nextLine();
    }
    
    static void rectangle ()
    {
        System.out.println("Introdueix la mida del costat gran del rectangle: ");
        double n = entrada.nextDouble();
        System.out.println("Introdueix la mida del costat petit del rectangle: ");
        double m = entrada.nextDouble();
        double peri = 2*n+2*m;
        double area = n*m;
        mostrarResultat(peri,area);
        entrada.nextLine();
    }
    
    static void isosceles ()
    {
        System.out.println("Introdueix la mida dels costats iguals del triangle isòsceles: ");
        double n = entrada.nextDouble();
        System.out.println("Introdueix la mida del costat desigual del triangle isòsceles: ");
        double m = entrada.nextDouble();        
        if (n == m)
        {
            System.out.println("Aquest triangle NO és isòsceles.");
            System.out.println("");
        }
        else
        {
            double resultat = (n*n)-(m*m);
            if (resultat < 0)
                resultat *=-1;
            double alcada = Math.sqrt(resultat);
            double peri = 2*n+m;
            double area = (m*alcada)/2;
            mostrarResultat(peri,area);
        }
        entrada.nextLine();
    }
    
    static void cercle ()
    {
        System.out.println("Introdueix el radi del cercle: ");
        double n = entrada.nextDouble();
        double peri = 2*n*Math.PI;
        double area = Math.PI*(n*n);
        mostrarResultat(peri,area);
        entrada.nextLine();
    }
    static void mostrarResultat(double perimetre, double superficie)
    {
        System.out.printf("Perímetre: %.2f\n",perimetre);
        System.out.printf("Superfície: %.2f\n",superficie);
        System.out.println("");
    }
}
