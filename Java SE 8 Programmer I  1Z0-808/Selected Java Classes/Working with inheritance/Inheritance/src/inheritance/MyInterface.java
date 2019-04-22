/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author gab12
 */
abstract interface MyInterface {
    
    int INT_CONSTANT = 3;
    
    default String deffTwoMethod() {
        return "This is the second default method";
    }
    
    default int myNum() {
        return 4;
    }
    
    interface nested{
      
    }
    
    abstract int method();
    int intM();
    
    default int parentM() {
        return 200;
    }
    

    
}
