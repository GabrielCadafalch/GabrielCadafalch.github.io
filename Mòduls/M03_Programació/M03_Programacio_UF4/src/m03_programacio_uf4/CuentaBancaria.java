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
public class CuentaBancaria {
    
    private double saldo;
    public static int totalCuentas = 0;
    
    public double saldo() {
        return saldo;
    }
    
    public boolean enNumerosRojos() {
        return saldo < 0;
    }
    
    public void transferencia(double valor, CuentaBancaria destino) {
        this.saldo -= valor;
        destino.saldo += valor;
    }
    
    public void movimiento(double quantitat) {
        this.saldo += quantitat;
    }
    
    public static void incrementaTotalCuentas() {
        totalCuentas++;
    }
    
}
