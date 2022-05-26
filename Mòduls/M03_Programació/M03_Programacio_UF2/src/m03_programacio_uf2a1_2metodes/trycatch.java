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
public class trycatch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean entradaCorrecta;
        do {
            entradaCorrecta = false;
            try {
                int[] array = new int [10];
                array[10] = 5;

                int divident = 3;
                System.out.println("Introdueix el divisor: ");
                int divisor = sc.nextInt();
                int quocient = divident / divisor;
                System.out.println("Quocient = " + quocient);
                entradaCorrecta = true;

                String nom = "Gabriel";
                System.out.println("Nom: " + nom);
                
            } catch(ArrayIndexOutOfBoundsException e1){
                System.out.println("Error (fora de rang): " + e1.getMessage());
            } catch(ArithmeticException e2){
                System.out.println("Error aritmètic: " + e2.getMessage());
            } catch(Exception e){
                System.out.println("S'ha produït un error: " + e.getMessage());
            }
        }while(!entradaCorrecta);
        int a = 21;
        System.out.println("A = "+ a);
    }
}
