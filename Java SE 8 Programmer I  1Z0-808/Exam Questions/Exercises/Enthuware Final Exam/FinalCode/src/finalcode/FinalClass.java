/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcode;

/**
 *
 * @author gab12
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FinalClass extends SuperClass implements Movable, Runnable, SameMovable {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    char c = 'c';
    int i2;
    
    {i2 = 4;
    c = (char)i2;
    }
    
    
    
    static int aStaticVar = myStaticInt;
    
     public FinalClass()throws Exception{
         i2 = 5;
     }

    static void aMethod() throws RuntimeException{}
    
    static float returnF(){float f = 10f; return f;}

    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder ss = new StringBuilder("ws");
        String s = new String("Hola");
        String s1 = "Hola";
        
        System.out.println(s1 == "Hola");
        System.out.println(s.equals("Hola"));
        
        Double i = (double)Integer.parseInt("1");
        Double d = Double.parseDouble("1.2f");
        Float f = Float.parseFloat("1.2123f");
        Float f4 = 2.0f;
        
        Integer ii2 = Integer.valueOf("1");
        System.out.println(ii2.getClass());
        System.out.println(Integer.parseInt("1"));
        System.out.println(Integer.valueOf("1").getClass());
        
        ArrayList al = new ArrayList();
        List<Integer> al2 = new ArrayList();
        List l3 = new ArrayList();
        
        float ff = returnF();
        float f2 = ff;
        System.out.println(ff);
        System.out.println(f2);
        System.out.println(10.0f);
        
        
        // i = 10;
        // "i" cannot be accessed.

        //////////////////////////////

        switch(5){
        case 5: {System.out.println("Hola"); int ii = 10;}
        break;
        default: {System.out.println("Default: ");}

        //////////////////////////////
        }
        try{
            Movable mv = new FinalClass();
            Runnable rn = new FinalClass();
            mv.move();
            rn.move();
            Movable mm = null;
            Runnable sc = (Runnable)new SuperClass();
        }
        catch(Exception io){}
        

        try{
            aMethod();
        }
        
        finally{}
    }
}