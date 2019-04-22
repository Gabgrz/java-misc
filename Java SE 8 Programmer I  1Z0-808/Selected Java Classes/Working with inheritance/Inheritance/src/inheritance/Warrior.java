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
public class Warrior{
    
    public static void method(){
        PvPOwner pvpo = (PvPOwner)new Warrior(); // Compiles. The compiler does not know whether this class has subclasses.
        // If this class was final, it won't compile because the compiler knows there are no subclasses and this one does NOT implement the interface.
        
        
    }
    
}
