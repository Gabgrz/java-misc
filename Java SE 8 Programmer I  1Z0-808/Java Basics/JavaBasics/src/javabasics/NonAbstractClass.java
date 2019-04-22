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
public class NonAbstractClass extends AbstractClass{
    @Override
    int number(){
        int num = number2();
        return num;
    }

    StringBuilder returnString(){
        StringBuilder str = appendText("World!");
        return str;
    }
    
    
}
