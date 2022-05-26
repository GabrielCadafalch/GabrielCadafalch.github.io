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

import java.util.Scanner;
public class Ex02_CercaBinaria {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                        
        System.out.print("Introdueix el total d'elements: ");
        int totalElements = sc.nextInt();
        
        int[] vector = generaVector(totalElements);
        ordenaBombolla(vector);
        
        System.out.print("Introdueix un element a cercar: ");
        int elementACercar = sc.nextInt();        
        
        mostraVector(vector);
        //Cerca seqüencial
        System.out.println("Cerca seqüencial:");
        int posicio = cercaSequencial(vector,elementACercar);
        System.out.println("Posició: " + posicio);
        System.out.println("");
        
        // Cerca binària
        System.out.println("Cerca binària:");
        posicio = cercaBinaria(vector,elementACercar);
        System.out.println("Posició: " + posicio);
    }
    
    
    static int cercaSequencial(int[] array, int valor) {
        int comptadorPassades = 0;
        boolean trobat = false;
        int index = 0;
        // Temps inicial
        long tempsInicial = System.currentTimeMillis();
        
        for (index = 0; index < array.length; ++index)
        {
            comptadorPassades++;
            if (array[index] == valor) {
                trobat = true;
                break;
            }                            
        }        
        // Temps final
        long tempsFinal = System.currentTimeMillis();                        
        System.out.println("Total passades: " + comptadorPassades);
        System.out.println("Temps total (ms): " + (tempsFinal-tempsInicial));        
        
        if (trobat)
            return index;
        
        return -1;
    }   
    
    static int cercaBinaria(int[] array, int valor) {
        int comptadorPassades = 0;
        boolean trobat = false;
        int index = 0, indexEsq = 0, indexDret = array.length - 1;
        // Temps inicial
        long tempsInicial = System.currentTimeMillis();
        
        while (indexEsq <= indexDret) {
            comptadorPassades++;
         
            index = (indexDret + indexEsq)/2;
            if (array[index] == valor) {
                trobat = true;
                break;                
            }
            if (array[index] < valor)
                indexEsq = index + 1;
            else
                indexDret = index - 1;
        }
        
        // Temps final
        long tempsFinal = System.currentTimeMillis();                        
        System.out.println("Total passades: " + comptadorPassades);
        System.out.println("Temps total (ms): " + (tempsFinal-tempsInicial));        
        
        if (trobat)
            return index;
        
        return -1;
    }
    
    static int[] generaVector(int numElements) {
        
        int[] array = new int[numElements];
        // Aleatori
        for (int i = 0; i < numElements; ++i) {
            array[i] = (int)(Math.random()*numElements);            
        }
        
        return array;        
    }

    static void ordenaBombolla(int[] vector) {

        int comptadorPassades = 0;
        // Fer ordenació
        for(int i = 0; i < vector.length - 1; ++i)
        {
            for (int j = 0; j < vector.length - 1 - i;++j)
            {
                comptadorPassades++;
                if (vector[j] > vector[j+1])
                {
                    // Intercanviem posicions
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;                    
                }
            }
        }
        /*
        System.out.println("Vector ordenat:");
        mostraVector(vector);
        System.out.println("Total passades: " + comptadorPassades);
        */
    }    
 
    static void mostraVector(int[] vector) {
        
        for (int element : vector)        
            System.out.print(element + " ");
        
        System.out.println();
    }    
}
