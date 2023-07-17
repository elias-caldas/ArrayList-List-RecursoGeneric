/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

/**
 *
 * @author Pc Elias
 */
public class Exercicios {

    public static void main(String[] args) {
        
        Conta conta4 = new Conta();
        
        Conta conta3 = new Conta ();
            
        Conta conta2 = new Conta();
            
        Conta conta1 = new Conta();
        
        double [] saldoContas = new double[4];
        
        conta1.saldo = 20;
        conta2.saldo = 30;
        conta3.saldo = 40;
        conta4.saldo = 20;
        
        saldoContas[0] = conta1.saldo;
        saldoContas[1] = conta2.saldo;
        saldoContas[2] = conta3.saldo;
        saldoContas[3] = conta4.saldo;
        
        
        
        for (int i = 0; i < saldoContas.length; i++){
        System.out.println(saldoContas[i]);
    }
        
        
        
 

        
       
        
    }
}
