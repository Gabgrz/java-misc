/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Foxy;
import dog.Dog;
import foxx.Foxxo;

/**
 *
 * @author gab12
 */
public class starfox extends Dog{
    
    public starfox(){
        Integer interW = 9;
        // char c = (int)(1 + interW); 
        // Never possible to convert int to char.
        
        final Byte b = 22;
        final int inter2W = 65000;
        
        char d = inter2W;
        int s = Integer.MAX_VALUE;
        System.out.println("Star int: "+s);
        char cd = (char)s;
        char maxc = Character.MAX_VALUE;
        System.out.println("Star char after conversion: " + cd);
        System.out.println("Star CHAR max  " + maxc);
        
        // Double does have its prefix 'D' or 'd' int ii = 123d;
        
        
        
        float f = (float)123456789.0;
        double dd = 123456789.0;
        System.out.println("Float Lossy value: " + (float)f);
        System.out.println("Double precise value: " + (double)dd);
        
        // 1. If an int is assigned to a char, it has to be a compile constant value.
        // Otherwise, the compiler doesn't know the value of the int and cannot assign it to char because of possible lossly conversion from int to char.
        // Int can hold a lot whereas char can hold to about ~65,000.
        
        Integer charToInt = (int) 'a';
    }
    
    
    
    
    void a(){
        char c = 'a';
        final char c2 = 'b';
        switch (c){
            case 'a' : System.out.println();
            case 1 : ;
        }
    }
    
    public static void main (String[] str){
        Dog d = new Dog();
        starfox sf = new starfox(); 
        
        // CANNOT access protected members as the type reference is of the super class, not the derived class.
        // RULE: Only if the reference is of a type implemented by the code declaring the reference, access to protected members suceeds.
        // So, protected members are to be used by objects of the subclass that inherites the protected member.
        // If coding on the source file of that subclass, and creating an object of the super class, access to the protected member won't be allowed.
        
        int i = sf.protectedVar;
        int i2 = sf.protectedFinal;
        
        Foxxo foxo = new Foxxo();
        int iii = foxo.protectedVar;
        
        
        
    }
    
}