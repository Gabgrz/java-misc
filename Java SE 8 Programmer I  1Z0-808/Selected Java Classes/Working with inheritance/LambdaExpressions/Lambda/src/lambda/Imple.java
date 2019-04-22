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
public class Imple implements Operation{
    
    public int operation(int num1, int num2){
        return 0;
    }
    
    
    Operation add = (x, y) -> x + y;
    Operation substract = (x, y) -> x - y;
    Operation multiply = (x, y) -> x * y;
    Operation divide = (x, y) -> x / y;
    
    public int suma(int num1, int num2){
        return num1+num2;
    }
    
    public int resta(int num1, int num2) {
        return num1 - num2;
    }
    
    public int multi(int num1, int num2) {
        return num1 * num2;
    }
    
    public int div(int num1, int num2) {
        return num1 / num2;
    }
    
    
}
