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
public interface TwoInterface {
    
    public int INT_CONSTANT = 5;
    int INT_TWO_CONSTANT = 10;
    
    default Object defMeth(){
        return "Interface Default method";
    }
    
    default int myNum() {
        return 20;
    }
    
    default void am(){
        System.out.println("");
    }
    
    default String deffTwoMethod(){
        return "This is the second default method";
    }
    
    static void helperMeth(){
	System.out.println("Static method in interface");
    }
    
    default int parentM() {
        return 100;
    }
}
