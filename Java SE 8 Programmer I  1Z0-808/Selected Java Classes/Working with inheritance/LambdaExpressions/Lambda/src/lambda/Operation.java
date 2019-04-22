/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author gab12
 */
public interface Operation {
    
    int operation(int num1, int num2);
    
    default int suma(int num1, int num2){
        return num1+num2;
    }
    
    default int resta(int num1, int num2) {
        return num1 - num2;
    }
    
    default int multi(int num1, int num2) {
        return num1 * num2;
    }
    
    default int divi(int num1, int num2) {
        return num1 / num2;
    }
}
