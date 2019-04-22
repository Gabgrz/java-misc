/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author gab12
 */
public class Poly extends Warrior implements Fighter{

    static float f;
    static double d;
    static float ff = 2.2f;
    
    int power = 2;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            Fighter f1 = (Fighter) new Warrior();
            // It's possible to cast Warrior to Fighter even if there's no interface implementation
            // Warrior is not final and can be extended by another class that does implement Fighter

            Fighter f2 = new Poly(); // Poly implements Fighter
            Fighter f3 = (Poly) new Warrior(); // Compiles but RuntimeException is thrown as a Warrior object can't be cast to Poly

            Warrior w1 = new Warrior();
            Fighter f4 = (Fighter) w1;
            Fighter f5 = (Poly) w1;
        }
        catch (ClassCastException cce){}
        
        
        int i1 = /* */ 2;
        String s1 = /* */ "Hola";
        String s2 = /* */ 
                "Hola";
        String s3 = // this is a comment
                "Hello old friend lol";
        
        System.out.println(f); // prints 0.0
        System.out.println(d); // prints 0.0
        System.out.println(ff); // prints 2.2
        
        Fighter hazant = new Poly();
        System.out.println("Hazant power: "+hazant.power);
        System.out.println("Hazant power: "+((Poly)(hazant)).power);
        System.out.println("Hazant punch: "+hazant.punch(5)); // Calls punch() from base class Warrior as Poly does not override method
        
        Poly ogro = new Poly();
        System.out.println("Ogro power: " + ogro.power);
        System.out.println("Ogro power: " + ((Poly) (ogro)).power);
        System.out.println("Ogro punch: " + ogro.punch(5)); // Calls punch() from base class as Poly does not override method
        

    }
}