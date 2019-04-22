/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author gab12
 */
public class Sample implements IInt{    
    
    int thevalue2 = 10; // Instance field can hide interface's static field.
    static int thevalue = 20; // Static field can hide interface's static field.
    
    static void meth(){} // Static method does not override or hide Interface static method as it's NOT inherited.
    
    // void meth(){} 
    // Instance method cannot overload static method with same signature 
    
    public static void main(String[] args){
        Sample s = new Sample();  //1       
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3    
        int l = thevalue;         //4   
        
        System.out.println(IInt.thevalue);
        System.out.println(Sample.thevalue);
        System.out.println(thevalue);
    } 
}