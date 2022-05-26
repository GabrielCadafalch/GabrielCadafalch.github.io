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
public class Ex01Practica { //Calculadora Adaptat
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean fin = false;
        while(!fin)
        {
            String x = entrada.nextLine().toLowerCase();
            if (!x.equals("s"))
            {
                int n = Integer.parseInt(x);
                int m = entrada.nextInt();
                entrada.nextLine();
                String a = entrada.nextLine().toLowerCase();
                switch (a)
                    {
                        case "+":
                            sumar(n,m);
                            break;
                        case "-":
                            restar(n,m);
                            break;
                        case "x":
                            multiplicar(n,m);
                            break;
                        case"/":
                            dividir(n,m);
                            break;
                }
            }
        else
        {
            fin = true;
        }
        }
        entrada.close();
    }
    static void sumar(int n, int m)
    {
        System.out.println(n+" + "+m+" = "+(n+m));
    }
    static void restar(int n, int m)
    {
        System.out.println(n+" - "+m+" = "+(n-m));
    }
    static void multiplicar(int n, int m)
    {
        System.out.println(n+" x "+m+" = "+(n*m));
    }
    static void dividir(int n, int m)
    {
        if (m!=0)
            System.out.println(n+" / "+m+" = "+(n/m));
        else
            System.out.println("No es pot dividir per 0.");
    }
    static boolean isNumeric(String a)
    {
        try
        {
            Integer.parseInt(a);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}
