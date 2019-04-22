/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author gab12
 */
public interface Swimmer {
    
    int speed = 10;
    
    boolean isSwim();
    
    public default String swim(){
        return "Swimming";
    }
    
    void backStyle();
}
