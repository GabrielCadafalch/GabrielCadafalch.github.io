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
public class Ex04Practica { //Figures3D Adaptat
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean fin = false;
        while(!fin)
        {
            String figura = entrada.nextLine().toLowerCase();
            if (figura.equals("s"))
            {
                entrada.close();
                fin = true;
            }
            else
            {
                switch (figura)
                {
                    case "h":
                        hexaedre("h");
                        break;
                    case "e":
                        esfera("e");
                        break;
                    case "t":
                        tetraedre("t");
                        break;
                    case "c":
                        cilindre("c");
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    static void esfera(String esfera)
    {
        System.out.println("==Esfera==");
        //System.out.println("Introdueix el radi del cercle: ");
        double n = entrada.nextDouble();
        double area = 4*Math.PI*Math.pow(n, 2);
        double volum = (4*Math.pow(n, 3)/3)*Math.PI;
        mostrarResultat(area,volum,esfera);
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    
    static void tetraedre (String tetraedre)
    {
        System.out.println("==Tetraedre==");
        //System.out.println("Introdueix la mida d'un costat del triangle equilater: ");
        double n = entrada.nextDouble();
        double m = n/2;
        double alcada = Math.sqrt((n*n)-(m*m));
        double area = 4*((m*alcada)/2);
        double volum = (Math.sqrt(2)/12)*Math.pow(n,3);
        mostrarResultat(area,volum,tetraedre);
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    
    static void hexaedre (String cub)
    {
        System.out.println("==Hexaedre==");
        //System.out.println("Introdueix la mida d'una aresta de l'hexaedre: ");
        double n = entrada.nextDouble();
        double area = n*n*6;
        double volum = n*n*n;
        mostrarResultat(area,volum,cub);
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    static void cilindre(String cilindre)
    {
        System.out.println("==Cilindre==");
        //System.out.println("Introdueix la mida del radi del cercle del cilindre: ");
        double n = entrada.nextDouble();
        //System.out.println("Introdueix l'alçada del cilindre: ");
        double m = entrada.nextDouble();
        
        double area =2*Math.PI*n*(n+m);
        double volum = Math.PI*(n*n)*m;
        
        mostrarResultat(area,volum,cilindre);
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    static void mostrarResultat(double superficie, double volum, String input)
    {
        System.out.printf("Superfície: %.2f\n",superficie);
        System.out.printf("Volum: %.2f",volum);
        if (input.equals("s"))
            entrada.close();
        else
            System.out.println("");
    }
}
