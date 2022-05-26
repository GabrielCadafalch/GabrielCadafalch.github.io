/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AceptaElReto;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Problema_121_ChiclesDeRegalo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int envoltoriosNecesarios = entrada.nextInt(); // e = envoltorios necesarios para que nos den chicles gratis
        int chiclesGratis = entrada.nextInt(); // ch = chicles gratis por envoltorios
        int chiclesComprados = entrada.nextInt(); // t = total de chicles comprados
        
        while (envoltoriosNecesarios > chiclesGratis && chiclesGratis >= 1)
            {
                int envoltoriosRestantes = chiclesComprados%envoltoriosNecesarios + chiclesGratis;
                int cantidadChiclesGratis = chiclesComprados/envoltoriosNecesarios;
                int cantidadTotal = chiclesComprados + cantidadChiclesGratis;
                while (envoltoriosRestantes >= envoltoriosNecesarios && envoltoriosRestantes > 0){
                    cantidadChiclesGratis = envoltoriosRestantes/envoltoriosNecesarios;
                    cantidadTotal = chiclesComprados + cantidadChiclesGratis;
                    envoltoriosRestantes = envoltoriosRestantes%envoltoriosNecesarios;
                }
                System.out.println(cantidadTotal+" "+envoltoriosRestantes);
                envoltoriosNecesarios = entrada.nextInt();
                chiclesGratis = entrada.nextInt();
                chiclesComprados = entrada.nextInt();
            }
            System.out.println("RUINA");
    }
}
