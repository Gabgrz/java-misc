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
public interface Nadador extends Swimmer {
    
    int speed = 20;
    
    
    
    @Override
    public default String swim(){
        int ii = new Integer(1);
        return "nadador";
    }
    
    void backStyle();
}
