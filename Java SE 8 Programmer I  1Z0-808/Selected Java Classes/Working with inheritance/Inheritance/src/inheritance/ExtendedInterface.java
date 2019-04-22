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
public interface ExtendedInterface extends MyInterface, TwoInterface{

    default int parentM(){
        return 400;
    }
    
    default String deffTwoMethod() {
        return "Inheritance overriding method";
    }
    
    default int myNum() {
        return 500;
    }
    

    
    
    
    
    // Trying to override two default methods without default keyword will result in compilation error. 
    // default must be used as overriding method is default
    
    // Two access parent interface members, use <interface>.super.
        
    }
        
