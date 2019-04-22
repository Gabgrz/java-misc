/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

import java.util.Date;


        
      

/**
 *
 * @author gab12
 */
public class JavaBasics {
    
    String myName;
    byte myByte = 127;
    
    byte num = 100;
    short sum = 1240;
    int total = 48764;
    static long population = 2147483612312312318L;
    static long popu;
    long ants = 3333333L;
    
    static int pop = (int) population;
    
    int baseDecimal = 385;
    int octaVal = 0_32410;
    int hexaVal = 0x12310AbC;
    int binVal = 0b11100;
    
    static long decVal = 100__2___________________5;
    static long suma = decVal + 1;
    
    static String myLastName;
    static int myAge;
    protected String protecName = "ProtectedName";
    private String name = "John";
    
    private String throwName(){
        return "Heya";
    }
    
        
    static int getMyAge(){
        return myAge;
    }
    
    protected String metaThrow(){
        return throwName();
    }
    
    static int increment(Integer inte){
        ++inte;
        return inte;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int £currency = 0;
        int $currency = 0;
        int _underscore = 0;
        
        long l= 213123123;
        int int1 = 23223;
        short s2 = 123;
        
        int one = 1;
        boolean btrue = true;
        

        
        int suma = (int) l+int1+s2;
        
        char z = 'z';
        char zInt = 122;
        char uniCode = '\u0122';
        char uniRandom = '\u1111';
        char uniR = '\u2222';
        
        System.out.println("IS IT LESSER? "+(z <= zInt));
        
        char castChar = (char) -122;
        
        String s = "/* asd"
                 +"*/ My name is John";
        System.out.println(s);
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        
        Date myUtilDate;
        java.sql.Date mySqlDate;
        
        JavaBasics2 javabasics = new JavaBasics2();
        String string = javabasics.returnName();
        System.out.println(string);
        
        NonAbstractClass nonAbsClass = new NonAbstractClass(); 
        int myInt = 7;
        boolean result = true;       
        if (result == true) do System.out.println(myInt); while (myInt > 10);
    

        System.out.println("Result from NonAbstractClass Method is: "+nonAbsClass.number());
        System.out.println("String from NonAbstractClass Method is: "+nonAbsClass.returnString());
        
        StaticMembers staticMembers = null;
        System.out.println(staticMembers.myLastName);
        System.out.println(staticMembers.getMyAge());
        System.out.println(StaticMembers.getMyAge());
        
        System.out.println(suma);
        
        System.out.println(z+" "+zInt+" "+uniCode+" "+uniRandom+" "+uniR+" "+castChar);
        
        System.out.println(pop);
                
        Byte mByte = new Byte((byte)200);
        Long mLong = new Long(2147483612312312318L);
        
        long longe = 2147483612312312318l;
        int li = (int)longe;
        System.out.println("Primitive: "+li);
        int longToInt = mLong.intValue();
        System.out.println(longToInt);
        
        String trueS = "truE";
        boolean parseBool = Boolean.parseBoolean(trueS);
        System.out.println(parseBool);
        System.out.println("Parsed Boolean: "+Boolean.parseBoolean(trueS));
        
        Long longtoInt = new Long(mLong.intValue());
        System.out.println("Long to and from Int "+longtoInt);
        
        Double dou = new Double(12312.3);
        Double dd = Double.valueOf(2323);
        
        System.out.println("Double value of: "+dd);
        
        System.out.println("Double Wrapper Comparisson: "+dou.compareTo(02.310000));
        
        
        System.out.println("Unbox Wrapper: "+JavaBasics.increment(Integer.valueOf(10)));
        char cc = '9';
        System.out.println(cc);
        
        JavaBasics.popu = 123123l;
        System.out.println("PULATION: "+popu);
        
        System.out.println('a'+'b'); // Char has an integer value when being operated
        
    }   
}