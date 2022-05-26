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
public class Ex01_VectorsAleatoris {
    public static void main(String[] args) {
        final int ELEMENTS = 10;
        
        int[] a = vectors(0,9,ELEMENTS);
        System.out.print("A[] = ");
        mostrarVector(a);
        
        int[] b = vectors(100,999,ELEMENTS);
        System.out.print("B[] = ");
        mostrarVector(b);
        
        
        System.out.print("C[] = ");
        mostrarVector(vectorC(ELEMENTS, a, b));
    }
    static int[] vectorC(int n, int[] a, int[] b)
    {
        int[] vectorC = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; ++i)
        {
            vectorC[j] = a[i];
            ++j;
            vectorC[j] = b[i];
            ++j;
        }
        return vectorC;
    }
    static void mostrarVector(int[] a)
    {
        for (int i = 0; i < a.length; ++i)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("");
    }
    static int[] vectors(int min, int max, int n)
    {
        int[] vector = new int[n];
        for (int i = 0; i<n; ++i)
        {
            vector[i] = (int) (Math.random()*(max+1-min))+min;
        }
        return vector;
    }
}
