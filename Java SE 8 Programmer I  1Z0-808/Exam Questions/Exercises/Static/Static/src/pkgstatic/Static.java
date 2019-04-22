/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;
import pkgstatic.StaticParent;
/**
 *
 * @author gab12
 */
public class Static extends StaticParent{
    
    static int parentStaticMethod() {
        return 30;
    }
    
    static int i1 = 5;
    static double staticMethod(){
        return 5.5;
    }
    
    double instanceMethod() {
        return 15.5;
    }
    
    static void myStaticMethod(){}
    // void myStaticMethod(){}
    // Compile error. Not possible to overload a static method with an instance method
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Static s = new Static();
        StaticParent s2 = new Static();
        StaticParent s3 = new StaticParent();
        
        System.out.println("Static SUPER field: "+StaticParent.i1); // Calls static member of SUPER class.
        System.out.println("Static THIS field: "+i1); // Calls static member of THIS class.
        System.out.println("THIS instance static field: "+s.i1);
        System.out.println("SUPER instance static field: "+s2.i1);
        System.out.println("SUPER instance static field: "+s3.i1);
        System.out.println("Inherited static field: "+s.i2);
        
        System.out.println("SUPER object static method: "+s2.staticMethod()); // Method determined by the variable class.
        System.out.println("SUPER object instance method: "+s2.instanceMethod()); // Method determined by the variable object type.
        
        System.out.println("SUPER static method inherited: "+s.parentStaticMethod()); // Method determined by the variable object type.
        
    }
}