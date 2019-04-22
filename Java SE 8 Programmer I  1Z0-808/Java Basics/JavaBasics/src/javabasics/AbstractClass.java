/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

/**
 *
 * @author gab12
 */
public abstract class AbstractClass{
    private String name;
    
    private final StringBuilder finalText = new StringBuilder("Hello");
    
    abstract int number();
    int number2(){
        return INTNUMBER;
    }
    
    private final int INTNUMBER = 2;
    
    StringBuilder appendText(String toAppend){
        return finalText.append(toAppend);
    }
    
}