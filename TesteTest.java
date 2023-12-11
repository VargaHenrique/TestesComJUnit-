/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.teste;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Username
 */
public class TesteTest {
 
    
    Teste test = new Teste();
   @Test 
    public void testSomeMethod() {
        
       assertEquals(10, test.metodoSoma(5, 5));
       
    }
    
    @Test
    public void testSomeMethodII(){
    
    assertEquals(5, test.metodoSub(9, 4));
    
    }
    
    @Test
    public void testSomeMethodIII(){
    
    assertEquals(10, test.metodoMulti(5, 2));
    }
    
    @Test
    public void testSomeMethodIV(){
    
    assertEquals(10, test.metodoDivisao(10, 0));
    }
}

