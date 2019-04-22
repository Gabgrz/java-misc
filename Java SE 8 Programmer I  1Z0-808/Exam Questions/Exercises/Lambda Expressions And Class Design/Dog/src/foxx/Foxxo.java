/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foxx;
import Foxy.starfox;
import dog.Dog;

/**
 *
 * @author gab12
 */
public class Foxxo extends starfox{
    void METHOD(){}
    void mOew_wS(){}
    
        public static void main (String[] str){
        Dog d = new Dog();
        Foxxo sf = new Foxxo(); 
        
        // CANNOT access protected members as the type reference is of the super class, not the derived class.
        // RULE: Only if the reference is of a type implemented by the code declaring the reference, access to protected members suceeds.
        // So, protected members are to be used by objects of the subclass that inherites the protected member.
        // If coding on the source file of that subclass, and creating an object of the super class, access to the protected member won't be allowed.
        
        int i = sf.protectedVar;
        int i2 = sf.protectedFinal;
        
    }
    
}
