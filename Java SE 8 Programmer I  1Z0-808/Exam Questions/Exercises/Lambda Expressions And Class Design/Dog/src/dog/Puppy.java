/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;



/**
 *
 * @author gab12
 */
public class Puppy extends Dog{
    
    @Override
    int bite(int i) { // Double not allowed as double is not compatible with int.
        i = 1;
        return i;
    }
    
    static double doubleBite(int i) {
        i = 1;
        return 2f;
    }
    
    static float floatBite(int i) {
        i = 1;
        System.out.println("MONK");
        return 2f;
        
    }
    
    
    static char charBite(final int i) {
        
        final int i2 = 2;
        int i6;
        i6 = i+5;
        int b = 2;
        return i2;
    }
    
    /*
    char intBite((int i) {
        i = 1;
        int b = 2;
        return b;
    }
    */
    
    public Puppy(boolean canSwim){
	super(canSwim);
}
    
    static{
        System.out.println("\n");
        System.out.println("Static initializer:");
        bark();
        breathe();
        System.out.println("-- NEXT LINE\n");
    }
    
    {
     //   breathe();
    }
    
    int age;
    
    public Puppy(){
        this(0);
    }
    
    public Puppy(int age){
        super();
        this.age = age;
    }
    
    public void puppyAttack(){
        try{
            bark();
        }
        catch(Exception e){}
    }
    
    public void dogAttack(){
        try {
            Dog.bark();
        } catch (Exception e) {
        }
    }
    
    
    // Overloaded method:
    
        
    @Override
    public Integer protecc(int protection, int strength){
        System.out.println("Puppy Overriding method executed");
        return 2;
    }
    
    
    public Integer protecc(byte protection, int strength){
            int damageReduced = protection*strength;
            System.out.println("Puppy Overloaded method executed");
            return damageReduced;
    }
    
    // Overriding method
    
    // Hiding
    
    public Integer protecc(long protection, int strength){
            int damageReduced = (int)protection*strength;
            System.out.println("Puppy Overloaded 2 method executed");
            return damageReduced;
    }

       
    public static Integer bark() throws RuntimeException{
        System.out.println("Puppy barks");
        return 2;
    } 
}