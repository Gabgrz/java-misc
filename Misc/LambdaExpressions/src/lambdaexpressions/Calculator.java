/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressions;
/**
 *
 * @author gab12
 */
public class Calculator {
  
    interface IntegerMath {
        int operation(int a, int b);
        // int alterOp(int a);
        // if two methods are defined in this interface, it's no longer a functional interface.
    }
  
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
}