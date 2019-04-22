/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressions;

/*
Objective:
Perform different operations given two integers.

Operations to perform:
1. Addition
2. Substraction
3. Multiplication
4. Division

---------
PLANNING
---------
Need a class that
- declares an interface containing one method that takes two integers to process.
- declares a method that takes two integers, an object of the interface and returns that object's operation.

On Main method
- Will use lambda expressions to implement the method that the Interface requires.
Since it only contains one method, this is a good fit.

- Will print out the operation

---------
STRUCTURE
---------

CLASSES
- Calculator
- LambdaExpressions

Class Calculator
{
    - Interface IntegerMath containing a method operation that takes two integers to process.
    - Method operateBinary. Takes two integers and an object of type Interface IntegerMath.
        Returns the object's operation.
}

Class LambdaExpressions{
Will use lambda expressions to implement the interface method as it only contains one.
Example of lambda expression:

(param1, param2) -> param1 + param2
AS IN 
IntegerMath addition =(param1, param2) -> param1 + param2

Print results

---------
EXTENSION
---------

*/

import lambdaexpressions.Calculator.IntegerMath;


/**
 *
 * @author gab12
 */
public class LambdaExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> {return a + b;};
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath multiplication = (a, b) -> a * b;
        IntegerMath division = (a, b) -> a / b;
        
        // IntegerMath alter = a -> a / 2;
        
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));
        System.out.println("5 * 10 = "+
            myApp.operateBinary(5, 10, multiplication));
        System.out.println("20 / 2 = "+
            myApp.operateBinary(20, 2, division));
        
    }
    
    
    
}
