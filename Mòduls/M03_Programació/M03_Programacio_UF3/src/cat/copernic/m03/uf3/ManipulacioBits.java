/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3;

/**
 *
 * @author rferrero
 */
public class ManipulacioBits {
    
    public static void main(String[] args) {
        
        int valor = 0x3C;
        System.out.println(valor);
        System.out.println(valor >> 1);
        System.out.println(valor >> 2);
        System.out.println(valor << 1);
        
        //valor <<= 1;
        //System.out.println(valor);
        System.out.println(valor & 0b00001111);
        System.out.println(valor | 0b00000001);
        valor |= 0b00000001;
        System.out.println(valor);
    }
}
