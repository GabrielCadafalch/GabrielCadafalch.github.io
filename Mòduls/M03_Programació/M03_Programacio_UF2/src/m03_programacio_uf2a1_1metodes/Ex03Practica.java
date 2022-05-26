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
public class Ex03Practica { //Figures2D Adaptat
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0;;++i){
            char figura = entrada.nextLine().toLowerCase().charAt(0);
            if (figura == 's')
            {
                entrada.close();
                break;
            }
            switch (figura)
            {
                case 'q':
                    quadrat ('q');
                    break;
                case 'r':
                    rectangle ('r');
                    break;
                case 't':
                    isosceles('t');
                    break;
                case 'c':
                    cercle('c');
                    break;
            }
        }
    }
    
    static void quadrat(char quadrat)
    {
        System.out.println("==Quadrat==");
        double n = entrada.nextInt();
        double area = n*n;
        double peri=4*n;
        mostrarResultat(peri,area,quadrat);
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    
    static void rectangle (char rectangle)
    {
        System.out.println("==Rectangle==");
        double n = entrada.nextDouble();
        double m = entrada.nextDouble();
        double peri = 2*n+2*m;
        double area = n*m;
        mostrarResultat(peri,area,rectangle);
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    
    static void isosceles (char triangle)
    {
        System.out.println("==Triangle isòsceles==");
        double costats = entrada.nextDouble();
        double base = entrada.nextDouble();        
        if (costats == base)
        {
            System.out.println("Aquest triangle NO és isòsceles.");
            System.out.println("");
        }
        else
        {
            double resultat = (costats*costats)-((base/2)*(base/2));
            if (resultat < 0)
                resultat *=-1;
            double alcada = Math.sqrt(resultat);
            double peri = 2*costats+base;
            double area = (base*alcada)/2;
            mostrarResultat(peri,area,triangle);
        }
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    static void cercle (char cercle)
    {
        System.out.println("==Cercle==");
        double n = entrada.nextDouble();
        double peri = 2*n*Math.PI;
        double area = Math.PI*(n*n);
        mostrarResultat(peri,area,cercle);
        if (entrada.hasNextLine())
        {
        entrada.nextLine();
        }
    }
    static void mostrarResultat(double perimetre, double superficie, char input)
    {
        System.out.printf("Perímetre : %.2f\n",perimetre);
        System.out.printf("Superfície: %.2f",superficie);
        if (input  == 's')
            entrada.close();
        else
            System.out.println("");
    }
}

