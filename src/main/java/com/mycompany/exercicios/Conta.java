/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author Pc Elias
 */
public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;
    
    
    public boolean sacar(double valor){
        if (this.saldo < valor){
            return false;
        } else{
            this.saldo -= valor;
            return true;
        }
    }
    
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public double calculaRendimento (){
        return this.saldo * 0.1;
    }
    
    public void impressao (){
        System.out.printf("Seu saldo disponivel e: %f, sr. %s", this.saldo, this.titular);
    }
    
    public String toString(){
        return "[titular = " + titular + ", numero = " + numero + ", agencia= " + agencia + "]";
    }
    
    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        Conta outraConta = (Conta) object;
        
        if(this.titular.equals(outraConta.titular)){
            return true;
        }
        return false;
    }
    
    
}
