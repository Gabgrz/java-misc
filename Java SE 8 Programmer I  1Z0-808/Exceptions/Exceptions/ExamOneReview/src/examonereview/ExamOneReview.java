/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examonereview;

/**
 *
 * @author gab12
 */
public class ExamOneReview {
    
        int instanceInt;
        
        String methodd(int instanceInt){
            instanceInt = instanceInt
                    ;
            return "";
        }
    
    static void testingVarargs(Long... a){
        // Can have one vararg only.
        System.out.println(a.length);
        
    }
    void instanceMeth(){
        int instanceInt = 20;
        println("INSTANCE METHOD");
        System.out.println(this.instanceInt);
        this.instanceInt = 30;
        System.out.println(instanceInt);
        System.out.println(this.instanceInt);
        println("END OF INSTANCE METHOD");
    }
    static void print(Object obj){
        System.out.print(obj);
    }
    
    static void println(Object obj) {
        System.out.println(obj);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String... args) throws Error {
        // TODO code application logic here
        
        // Using a method that takes varargs as argument
        
        ExamOneReview eor = new ExamOneReview();
        eor.instanceMeth();
        
        testingVarargs(Long.MAX_VALUE,Long.MIN_VALUE,new Long(232));
        
        // Putting in practice all operators precedence
        int i = 1;
        int i2 = 2;
        
        print("\n------------------"+"\n");
        println(++i + -i2++);
        i = 1;
        i2 = 2;
        print("\n------------------"+"\n");
        
        // WHAT! Precedence:
        // Postfix
        // Unary
        // Multiplication
        // Addition
        // Relational
        // Equality
        // AND
        // OR
        // Assignment
        
        boolean bool = i++ * -(--i2) * -5 * 10 / 2 % 5 == 0 && false || true;
        boolean bool2 = false || true && 0 == 5 % 2 / 10 * -5 * -(--i2) * i++;
        
        println(bool);
        println(bool2);
        
        print("\n------------------" + "\n");
        
        // Primitive data types
        
        byte b = 10;
        byte c = 20;
        double d = b+c;
        int i3 = b+c;
        long l1 = b+c;
        short s = (short)(b+c);
        byte by = (byte)(b+c);
        
        println(d);
        
        long b2 = 10;
        long c2 = 20;
        double d2 = b + c;
        println(d2);
        
        int inte = -2, integ = 4, integee = 10;
        System.out.println(integ);
        
        // WEIRD VARIABLE NAMES:
        
        int $$ = 0;
        int $€€ = 1;
        int _€€€€ = 20;
        int _$_$_$ = 12;
        
        
    }
}