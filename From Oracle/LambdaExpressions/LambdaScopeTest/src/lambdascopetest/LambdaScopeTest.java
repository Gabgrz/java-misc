/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdascopetest;

/**
 *
 * @author gab12
 */
import java.util.function.Consumer;

public class LambdaScopeTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;
        
        
        /*
        PSEUDOCODE
        1. Method methodInFirstLevel
            Does not return anything.
            Receives an int as argument.
        2. A functional interface object of type Consumer<Integer> is declared.
        3. A lambda expression implements the interface function:
            1. Prints variables to demonstrate scopes.
        4. The interface calls method "accept" to execute its function.
            Method takes x as its argument, which is then passed to y.
        
        TO REMEMBER: the argument of the lambda expression is the argument of the Functional Interface.

        */

        void methodInFirstLevel(int x) {
            
            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
            // x = 99;
            
            
            Consumer<Integer> myConsumer = (y) -> 
            {
                System.out.println("IN");
                System.out.println("x = " + x); // Statement A
                System.out.println("y = " + y);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " +
                    LambdaScopeTest.this.x);
            };

            System.out.println("OUT");
            myConsumer.accept(x);

        }
    }

    public static void main(String... args) {
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}