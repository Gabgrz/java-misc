/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.function.Predicate;

        
/**
 *
 * @author gab12
 */



public class Inheritance implements MyInterface, TwoInterface{
    
    @Override
    public String defMeth() {
        
        if(true){String s = "hola";

        }
        
        
        return "Overridden method!";
        // There is no default key to override method
        
    }
    
    
    
    
            
    // In concrete Class
    static void helperMeth() {
        System.out.println(MyInterface.INT_CONSTANT+INT_TWO_CONSTANT);
    }
    
    @Override
    public String deffTwoMethod() {
        return "This is the overriding method from two different interfaces!";
    }
    
    @Override
    public int parentM(){
        return 300;
    }
    
    
    
    
    @Override
    public int method() {
        return MyInterface.INT_CONSTANT;
        // Won't complie: return INT_CONSTANT;
    }
    
    public int intM(){
        return 1;
    }
    
    // Overriding method for two default methods inherited from different interfaces:
    @Override
    public int myNum() {
        return 'a';
    }
    
    
    
    private interface gInterface{
    // protected interface privateInterface{}
}
    
    protected class protecClass{}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        helperMeth();
        Inheritance inheritanceObj = new Inheritance();
        inheritanceObj.defMeth();
        System.out.println(inheritanceObj.deffTwoMethod());
        System.out.println(inheritanceObj.myNum());
        
        PvPOwner pvpo2 = (PvPOwner)new HazantWarrior();
        Warrior war = new HazantWarrior();
        HazantWarrior hazant = new HazantWarrior();
        PvPOwner ownerHazant = new HazantWarrior();
        
        PvPOwner pvpo1 = (PvPOwner)war;
        PvPOwner pvpo3 = hazant;
        
        // Predicate pvpo3 = (Predicate)new Inheritance();
        
        // PvPOwner pvpo1 = (PvPOwner)new Integer(2); 
        // Cast is impossible as Integer is a final class that does not implement interface Predicate.
    }
}
