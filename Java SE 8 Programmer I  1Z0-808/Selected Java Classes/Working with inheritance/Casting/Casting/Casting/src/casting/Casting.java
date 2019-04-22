/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author gab12
 */
public class Casting {

    public class LivingBeing{
        public void breathe(){};
    }
    
    int ii = 0xA;
    
    
    
    public class Animal extends LivingBeing{}
    public class Tiger extends Animal{}
    public class Lion extends Animal{}
    
    public class Person extends LivingBeing{public void beDumb(){System.out.println("Method as person");}}
    
    public class Programmer extends Person {
        public void program(){
            System.out.println("Method as programmer");}
                
        public Person toPerson(){
            Person p = new Person();
            return p;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        do{}while(false);
        int a=2, b=2;
        int c = a++/b++;
        
        
        System.exit(0);
        
        Casting casting = new Casting();
        LivingBeing lb = casting.new LivingBeing();
        
        LivingBeing lb2_lion = casting.new Lion();
        LivingBeing lb3_programmer = casting.new Programmer();
        
        // This is not allowed:
        // Programmer programmer = casting.new Person();
        // A Person object cannot be assigned to Programmer (base object assigned to derived object).
        
        // The opposite is possible:
        Person progra1 = casting.new Programmer();
        
        // Even if I say to the compiler that I am assigning a Programmer object, I can trick it at compile time but
        // Runtime will realize that I'm still assigning a Person.
        
        // Programmer progra2 = ((Programmer)casting.new Person()); // It complies but Runtime will realize it's still a Person.
        
        // If I try to assign Person, casted to Programmer, to Person, Runtime will still try to cast Person to Programmer when it's not possible.
        
        // Person person_progra2 = ((Programmer)casting.new Person()); // It complies but Runtime will realize it's still a Person.
        
        
        // Now let's cast Programmer to person.
        
        Person pers_pro = ((Person)casting.new Programmer()); // This compiles and valid at Runtime. Programmer assigned to Person variable.        
        pers_pro.beDumb();
        System.out.println(pers_pro.getClass());
        ((Programmer)pers_pro).program();
        
        
        
        // This will fail to compile but would succeed at runtime:
        
        Programmer pro_pers = casting.new Programmer();
        pro_pers.program();
        
        Person newP = pro_pers.toPerson();
        newP = ((Person)casting.new Programmer()); // I'm telling the compiler that I'm assigning an object of type Person to Programmer.
        
        
        // Programmer pro_perss = casting.new Person();
        
        
    }
    
}
