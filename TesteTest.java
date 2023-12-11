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
 
   @Test 
    public void testSomeMethod() {
        
        Teste proj = new Teste();
        Assertions.assertEquals(8, proj.metodoSoma());
    }
    
    @Test
    public void testSomeMethodII(){
    
    Teste proj = new Teste();
    Assertions.assertEquals(0, proj.metodoSub());
    
    }
    
    @Test
    public void testSomeMethodIII(){
    
    Teste proj = new Teste();
    Assertions.assertEquals(20, proj.metodoMulti());
    }
    
    @Test
    public void testSomeMethodIV(){
    
    Teste proj = new Teste();
    Assertions.assertEquals(3, proj.metodoDivisao());
    }
}

