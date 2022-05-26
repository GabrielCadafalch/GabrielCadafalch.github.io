/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_programacio_uf2a2;

/**
 *
 * @author alumno
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ex01_Ordenació {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix el nombre total d'elements: ");
        int totalElements = sc.nextInt();
        

        /*System.out.println("Ordenat per selecció: ");
        int[] vector = generaVector(totalElements);
        ordenaSeleccio(vector);

        System.out.println("Ordenat per bombolla: ");
        ordenaBombolla(vector);*/
        
        System.out.println("");
        System.out.println("ArrayList abans d'ordenar: ");
        ArrayList<Integer> llistaEnters = generaVectorLlista(totalElements);
        long tempsInicial = System.currentTimeMillis();
        for (int valor : llistaEnters)
        {
            System.out.print(valor + " ");
        }
        System.out.println("\n");
        
        Collections.sort(llistaEnters);
        long tempsFinal = System.currentTimeMillis();

        System.out.println("ArrayList després d'ordenar: ");
        for (int valor : llistaEnters)
        {
            System.out.print(valor + " ");
        }
        System.out.println("\n");
        
        
        System.out.println("Temps total (ms): " + (tempsFinal-tempsInicial));
    }
    public static int[] generaVector(int numElements)
    {
        int[] vector = new int[numElements];
        for (int i = 0; i < vector.length; ++i)
        {
            vector[i] = numElements-i;
        }
        
        return vector;
    }
    static void mostraVector(int[] vector, int totalPassades, long totalTemps)
    {
        for (int i = 0; i < vector.length; ++i)
        {
            if (i == vector.length - 1)
                System.out.print(vector[i]+".\n");
            else
                System.out.print(vector[i]+", ");
        }
        System.out.println("El total de passades fetes ha sigut: " + totalPassades);
        System.out.println("");
        System.out.println("Total temps (ms): "+totalTemps);
    }
    static void ordenaSeleccio(int[] vector)
    {
        // Ordenar mitjançant l'algoritme d'ordenació per selecció
        long tempsInicial = System.currentTimeMillis();
        int comptadorPassades = 0;
        for (int i = 0; i < (vector.length - 1); ++i)
        {
            for (int j = i+1; j < vector.length; ++j)
            {
                comptadorPassades++;
                if (vector[j] < vector[i])
                {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        long tempsFinal = System.currentTimeMillis();
        long tempsTotal = tempsFinal-tempsInicial;
        mostraVector(vector,comptadorPassades, tempsTotal);
    }
    static void ordenaBombolla(int[] vector)
    {
        // Ordenar mitjançant l'algoritme d'ordenació per bombolla
        long tempsInicial = System.currentTimeMillis();
        int comptadorPassades = 0;
        for (int limit = vector.length -1; limit > 0; --limit)
        {
            for (int i = 0; i < limit; ++i)
            {
                int j = i+1;
                comptadorPassades++;
                if (vector[i] > vector[j])
                {
                    int menor = vector[j];
                    int major = vector[i];
                    vector[j] = major;
                    vector[i] = menor;
                }
            }
        }
        long tempsFinal = System.currentTimeMillis();
        long tempsTotal = tempsFinal-tempsInicial;
        mostraVector(vector, comptadorPassades, tempsTotal);
    }
    static ArrayList<Integer> generaVectorLlista(int numElements)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < numElements; ++i)
        {
            array.add((int) (Math.random()*numElements));
        }
        return array;
    }
}
