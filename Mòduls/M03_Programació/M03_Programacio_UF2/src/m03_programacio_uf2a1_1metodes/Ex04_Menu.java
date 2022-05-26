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
public class Ex04_Menu {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean sortida = false;
        do
        {
        mostrarMenu();
        String opcio = entrada.nextLine();
        if (opcio.length() == 1 &&
           (opcio.charAt(0) == 'A' ||
            opcio.charAt(0) == 'B' ||
            opcio.charAt(0) == 'C' ||
            opcio.charAt(0) == 'X') )
        {
            switch (opcio)
            {
                case "A":
                    taulaDivEntera();
                    break;
                case "B":
                    fibonacci();
                    break;
                    
                case "C":
                    comptaVocals();
                    break;
                case "X":
                    sortida = true;
                    break;
                    
                default:
                    System.out.println("Opcció incorrecta!");
            }
        }
        }while(!sortida);
    }
    
    static void mostrarMenu()
    {
        System.out.println("");
        System.out.println("* * * * * * M E N U * * * * * *");
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("A - Taula divisió entera");
        System.out.println("");
        System.out.println("B - Fibonacci");
        System.out.println("");
        System.out.println("C - Compta vocals");
        System.out.println("");
        System.out.println("X - SORTIR");
        System.out.println("");
        System.out.println("Tria una opció: ");  
    }
    static void entrarMetodeNum()
    {
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Introdueixi un nombre natural: ");
        System.out.println("");
    }
    static void entrarMetodeLletres()
    {
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Introdueixi una frase: ");
        System.out.println("");
    }
    static void taulaDivEntera ()
    {
        System.out.println("");
        System.out.println("Taula de divisió entera");
        entrarMetodeNum();
        int n = entrada.nextInt();        
        int quocient;
        int residu;
        for (int i = 1; i <= 10; ++i) {
            quocient = n / i;
            residu = n % i;
            System.out.print(n + " / " + i + ": quocient = " + quocient);
            System.out.print(" i residu = " + residu + "\n");
        }
        System.out.println("");
        entrada.nextLine();
    }
    static void fibonacci ()
    {
        System.out.println("");
        System.out.println("Serie Fibonacci");
        entrarMetodeNum();
        int n = entrada.nextInt();
        long f = 1;
        long anterior = 0;
        long aux;
        System.out.print(f + " ");
        for (int i = 1; i < n; ++i) {
            aux = f;
            f = anterior;
            anterior = aux;
            f += anterior;
            System.out.print(f + " ");
            if (i % 9 == 0)
                System.out.println("");
        }
        System.out.println("");
        entrada.nextLine();
    }
    static void comptaVocals ()
    {
        entrarMetodeLletres();
        String a = entrada.nextLine();
        String b = a.toUpperCase();
        String Lletres = "AÁÀÄEÉÈËIÍÌÏOÓÒÖUÚÙÜ";
        int comptador = 0;
        for (int i  = 0; i < Lletres.length(); ++i)
        {
            char lletraValida = Lletres.charAt(i);
            for (int j  = 0; j < b.length(); ++j)
            {
                char lletra = b.charAt(j);
                if (lletra == lletraValida)
                {
                    comptador++;
                }
            }
        }
        System.out.println("La frase conté "+comptador+" vocals.");
        System.out.println("");
    }
}
