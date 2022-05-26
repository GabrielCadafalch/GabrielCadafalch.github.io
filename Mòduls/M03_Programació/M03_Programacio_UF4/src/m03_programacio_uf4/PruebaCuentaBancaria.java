/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_programacio_uf4;

/**
 *
 * @author alumno
 */
public class PruebaCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria.incrementaTotalCuentas();
        c1.movimiento(1000);

        CuentaBancaria c2 = new CuentaBancaria();
        CuentaBancaria.incrementaTotalCuentas();
        c2.movimiento(990);

        /*
        System.out.println("Total de cuentas bancarias: "+CuentaBancaria.totalCuentas);
        System.out.println("Saldo c1: " + c1.saldo());
        System.out.println("Saldo c2: " + c2.saldo());
        System.out.println("");
        System.out.println("Transferencia de 1500 de c1 a c2: ");
        c1.transferencia(1500, c2);
        System.out.println("");
        System.out.println("Saldo c1: " + c1.saldo());
        System.out.println("Saldo c2: " + c2.saldo());
        System.out.println("");
        System.out.println("Esta en numeros rojos? c1: " + c1.enNumerosRojos() + " c2: " + c2.enNumerosRojos());
         */
    }
}
