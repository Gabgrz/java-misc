/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import static java.lang.System.out;

/**
 *
 * @author gab12
 */
public class Inheritance extends ParentClass implements NewInterface{
    
    static int m() throws Exception{
        
        return 2;
        
        
    }
    
    
    int number = 100; // Instance or static FIELD can hide static FIELDS from Interface with no problem.
    static int number2 = 200;
    
    @Override
    void staticParentMethod(){} // Static method can hide interface static method.
    
    static{
        int num1 = anotherNumber;
        int num2 = NewInterface.number;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        out.println("H");
        
        int ii = 1;
        int suma;
        
        byte bb = 0;
                
        
        while(bb != 1){
            if(bb == 2){
                bb = 0;
            }
            bb--;
            out.println(bb);
        }
        
        suma = ++ii + ii + ++ii + ++ii;
        // 2 + 2 + 3 + 4
        
        System.out.println(ii);
        System.out.println(suma);
        
        NewInterface i = new Inheritance();
        Inheritance in = new Inheritance();
        System.out.println(anotherNumber);
        System.out.println(number2);
        System.out.println(((Inheritance)i).number);
        System.out.println(ParentClass_StaticField);
        
        System.out.println(((ParentClass)in).ParentClass_StaticField);
        System.out.println(in.ParentClass_StaticField);
        
        SubClass sc = new SubClass();
        AbstractClass.main2(new String[]{"Ho","h"});
        
        String myS = in.staticString;
        String myS2 = Inheritance.staticString;
        String myS3 = NewInterface.staticString;
        String myS4 = staticString;
        System.out.println("HASH CODE");
        System.out.println(Boolean.TRUE.hashCode());
        System.out.println(Boolean.TRUE.hashCode());
        System.out.println(Boolean.FALSE.hashCode());
        System.out.println(Boolean.FALSE.hashCode());
    }
}
