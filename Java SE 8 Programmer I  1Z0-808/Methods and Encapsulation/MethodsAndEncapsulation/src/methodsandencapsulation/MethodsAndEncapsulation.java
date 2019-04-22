/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandencapsulation;

/**
 *
 * @author gab12
 */
public class MethodsAndEncapsulation {
    
    private MethodsAndEncapsulation(){
        // return 2;
    }
    
    public void aMethod(char c){
        System.out.println("This is an char method");
    }
    
    public void aMethod(int i){
        System.out.println("This is an int method");
    }
    
        public void aMethod(long i){
        System.out.println("This is a long method");
    }
    
    double overloadedMethod(int[] array, int[] array2, int... args){
        return 2.0;
    }
    
    int[] varargs(int... args){
        int len = args.length;
        int[] arrInt = new int[len];
        int a = 0;
        for(int i = 0; i < args.length; i++){
            arrInt[i] = args[i];
            System.out.println(arrInt[i]);
        }
        return arrInt;
    }
    
    double overloadedMethod2(int entero, double doble){
        return 2.0;
    }
    
    double stringMethod(String myS){
        return 3;
    }
    
    // Can't be overloaded:
    // int overloadedMethod2(int entero, double doble) {
    //     return 2;
    // }
    
    double overloadedMethod2(double doble, int entero){
        return 2.0;
    }
    
    
   /* Example of incorrect overloaded method
   
    double overloadedMethod(int[] array){
        return 2.0;
    }
    
    double overloadedMethod(int... varargs){
        return 2.0;
    }
    
        
    /*
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println (p1.phoneNumber);
        System.out.println (new Phone().setNumber());
        
        // Overloaded method example 1:
       
        MethodsAndEncapsulation over = new MethodsAndEncapsulation();
        // Won't compile: over.overloadedMethod2(2, 2
        
        System.out.println(over.stringMethod(String.valueOf(3)));
        int[] arr = {1,2,3};
        
        int i;
        String a = null;
        
        for (i = 0; i < arr.length; i++){
            System.out.println(over.varargs(arr));
        }
        
        MethodsAndEncapsulation obj2 = new MethodsAndEncapsulation();
        char c = 222;
        System.out.println(c);
        obj2.aMethod(c);
        
    }
}