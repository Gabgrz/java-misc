/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examonereview;

/**
 *
 * @author gab12
 */
public interface GInterface {
    
    default void interMethod(){}
    static void interMethod2(){}
    void interMethod3();
    abstract void interMethod4();
    
    // final void interMethod5(); -> Not allowed to use final before Interface method.
    
}
