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
public class Lambda implements Operation{

    /**
     * @param args the command line arguments
     */
    
    public int operation(int num1, int num2){
        return 1;
    }
    
    
        static Operation add = (x, y) -> x + y;
        static Operation substract = (x, y) -> x - y;
        static Operation multiply = (x, y) -> x * y;
        static Operation divide = (x, y) -> x / y;
        

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(add.operation(5, 10));
        System.out.println(substract.operation(5, 10));
        System.out.println(multiply.operation(5, 10));
        System.out.println(divide.operation(5, 10));
        
    }
    
}
