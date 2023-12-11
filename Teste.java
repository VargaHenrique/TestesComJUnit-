/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

/**
 *
 * @author Username
 */
public class Teste {

    public int metodoSoma( int numero1, int numero2 ){
    
    int soma = numero1 + numero2;
    
    return soma;
    
    
    }
    
    public int metodoSub(int numero1, int numero2){
    
    int sub = numero1 - numero2;
    
    return sub;
    
    }
    
     public int metodoMulti(int numero1, int numero2){
    
    int multi = numero1 * numero2;
    
    return multi;
    
    }
     
     public int metodoDivisao(int numero1, int numero2){
      
     try{    
     int divi = numero1/numero2;
     return divi;
     }catch(Exception ex){
     throw new ArithmeticException("Não é possível dividir por zero");
     }
    
     
     }
    
    public static void main(String[] args) {
        System.out.println("Hello World, I . AM . GOD! ");
    }
  
}

