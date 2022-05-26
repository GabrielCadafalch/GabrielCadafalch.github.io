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
public class Ex03_Figures3D {
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        mostrarOpcions();
        String figura = entrada.nextLine();
        
        while (!figura.equals("0")){
            switch (figura)
            {
                case "1":
                    cilindre ();
                    break;
                case "2":
                    cub ();
                    break;
                case "3":
                    tetraedre();
                    break;
                case "4":
                    esfera();
                    break;
                default:
                    System.out.println("ERROR");
                    entrada.nextLine();
                    break;
            }
            mostrarOpcions();
            figura = entrada.nextLine();
        }
    }
    
    static void mostrarOpcions()
    {
        System.out.println("Introdueix una figura: ");
        System.out.println("1 - Cilindre");
        System.out.println("2 - Hexaedre");
        System.out.println("3 - Tetraedre");
        System.out.println("4 - Esfera");
        System.out.println("0 - Sortir");
    }
    
    static void cilindre()
    {                    
        System.out.println("Introdueix la mida del radi del cercle del cilindre: ");
        double n = entrada.nextInt();
        System.out.println("Introdueix l'alçada del cilindre: ");
        double m = entrada.nextInt();
        
        double area =2*Math.PI*n*(n+m);
        double volum = Math.PI*(n*n)*m;
        
        mostrarResultat(area,volum);
        entrada.nextLine();
    }
    
    static void cub ()
    {
        System.out.println("Introdueix la mida d'una aresta de l'hexaedre: ");
        int n = entrada.nextInt();        
        double area = n*n*6;
        double volum = n*n*n;
        mostrarResultat(area,volum);
        entrada.nextLine();
    }
    
    static void tetraedre ()
    {
        System.out.println("Introdueix la mida d'un costat del triangle equilater: ");
        double n = entrada.nextInt();        
        double m = n/2;
        double alcada = Math.sqrt((n*n)-(m*m));
        double area = 4*((m*alcada)/2);
        double volum = (Math.sqrt(2)/12)*n*n*n;
        mostrarResultat(area,volum);
        entrada.nextLine();
    }
    
    static void esfera ()
    {
        System.out.println("Introdueix el radi del cercle: ");
        double n = entrada.nextInt();
        double area = Math.PI*(n*n);
        double volum = 4*n*Math.PI;
        mostrarResultat(area,volum);
        entrada.nextLine();
    }
    
    static void mostrarResultat(double area, double volum)
    {
        System.out.printf("Superfície: %.2f\n",area);
        System.out.printf("Volum: %.2f\n",volum);
        System.out.println("");        
    }
}
