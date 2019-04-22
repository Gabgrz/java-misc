/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

import Foxy.Fox;
// Fails to compile because I already imported a Fox class import foxx.Fox;
import foxx.*; // Compiles fine because importing by Class name takes precende over using wildcard.
import Foxy.*; // This causes an ambiguous Fox class if line 8 is deleted, becaues both packages contain a Fox class.
import java.util.ArrayList;
import java.util.List;
import java.lang.Runnable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
/**
 *
 * @author gab12
 */
public class Dog extends Object implements GGPredicate, Swimmer, Nadador{
    
    protected int protectedVar = 10;
    final protected int protectedFinal = 20;
    
    int bite(int i){i = 1; return i;}
    
    static double doubleBite(int i) {
        i = 1;
        return i;
    }
    
    static float floatBite(int i) {
        i = 1;
        System.out.println("WOLOLO");
        return i;
        
    }
    

    
    char charr = 1;
    int i2 = 2;
    char char2 = 2;
    // Not possible: char char2 = i2;
    int i3 = charr;
    char c = 'a';
    int i4 = c;
    
    static char charBite(int i) {
        i = 1;
        
        
        final int i2 = (int)2.0;
        final int i3 = (int)2.0f;
        final int i4 = (int)12l;
        final long ll = 123;
        int i5 = (int)ll; // IT'S ALSO POSSIBLE TO EXPLICIT CAST LONG TO INT.
        System.out.println("CAST LONG TO INT POSSIBLE");
        
        Integer intW = (int)2.0;
        Float fW = (float)2;
        
        final long i6 = 128;
        byte bytee = (byte)i6;
        System.out.println("CAST INT TO BYTE SUCCESSFUL");
        System.out.println("BYTEE: "+bytee);
        
        // SO yes, it is possible to cast both double and floats to an int. It has to be an EXPLICIT CAST, NOT IMPLICIT.
        // IMPLICT CAST CAN BE INT TO FLOAT/DOUBLE
        
        float ff = (float)2.0;
        final double dd = 2.3f;
        ff = (float)dd;
        System.out.println("CONVERSION DOUBLE TO FLOAT WAS POSSIBLE"); // IT IS POSSIBLE TO CONVERT A DOUBLE TO FLOAT.
        
        
        char a = '1';
        System.out.println(a);
        
        final double b = 2;
        return i3;
    }
    
    int intBite(int i) {
        i = 1;
        int b = 2;
        return 'a';
    }
    
    public int swimSpeed;
    public boolean isSwim;
    
    public Dog(boolean isSwim) {
        this.isSwim = isSwim;
    }
    
    public void swim(int speed) {
        swimSpeed = speed;
        System.out.println("Swimming at speed: " + swimSpeed);
    }
    
    @Override
    public boolean isSwim(){
        return isSwim;
    }

	String status;
        
        Runnable runner = ()-> System.out.println("Running like crazy");
        
        
        
        static final boolean bool = true;
        
        static void breathe(){
            System.out.println("Dog breathing to live");
        }
        
        public Dog(){}

	public Dog(String status){
		this.status = status;
	}
        
        protected static Integer bark() throws RuntimeException {
            System.out.println("Dog barks");
            return 1;
        }
        
	static void isNewDog(GGPredicate<Dog> pred, Dog dog){
		if(pred.test(dog)){System.out.println("Doggo is new");}
		else{System.out.println("Doggo is dead, can't be new");}
	}
        
        public Integer protecc(int protection, int strength){
            int damageReduced = protection*strength;
            System.out.println("Dog protecc executed");
            return damageReduced;
        }
        
        
        void throwExc() {
            throw new NullPointerException();
        }
            
	public static void main(String[] args){
            
            
            
            
            int ii0 = 0;
            int ii1 = 1;
            int ii2 = 2;
            int ii3 = 3;

            int ii4 = ii0 = ii1 = ii2 = ii3 = 5+3, ii5 = 5;
            
            System.out.println("II0: "+ii0+"\n"+"II2: "+ii2+"\n"+"II3: "+ii3+"\n"+"II4: "+ii4);
                    
            Integer inte = Integer.valueOf((int) 1l);
            Character charr = Character.valueOf('c');
            Byte bb = new Byte((byte)12);
            Dog doggy = new Dog();
            try{doggy.throwExc();}catch(NullPointerException npe){}
            
            LocalDate ld = LocalDate.now();
            
            LocalDate ld2 = LocalDate.from(DateTimeFormatter.BASIC_ISO_DATE.parse("20180201"));
            LocalDate ld3 = LocalDate.from(DateTimeFormatter.ISO_DATE.parse("2018-02-02+02:00:00"));
            System.out.println("LD3: "+ld3);
            LocalDate ld5 = LocalDate.from(DateTimeFormatter.ISO_DATE.parse("2018-02-02+01:11:59"));
            System.out.println("LD4: "+ld5);
            
            LocalDate ld4 = LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2011-02-03"));
            
            int three = 3;
            boolean bool = true;
            
            if(true == false){System.out.println("HEY");}
            // System.out.printon()
            
            StringBuilder sbb = new StringBuilder("snorkler");
            StringBuilder sbb2 = new StringBuilder("yoodler");
            
            sbb.replace(3,4,sbb2.substring(4));
            System.out.println("New String 2: " + sbb + "\n");
            
            
            int ii = new Integer(1) + new Integer(2);
            
            int newii =  ii >>> 2;
            int newii2 =  ii >> 2;
            int newii3 =  ii << 2;
            int newii4 =  ii << 2;
            
            starfox sf = new starfox();
            
            floatBite(3);
            Puppy.floatBite(1);
            
            System.out.println("FLOAT BITE: "+floatBite(2));
            double doble = floatBite(3);
            System.out.println("CHAR BITE: "+charBite(2));
            
            
            Swimmer swimmerDog = new Puppy(true);
            System.out.println("CAN PUPPY SWIM? "+swimmerDog.isSwim());
            
            Dog swimmingDog = new Dog();
            System.out.println("SWIMMER DOG "+((Swimmer)swimmingDog).swim());
            
            Swimmer swimmerDog2 = new Dog();
            System.out.println("CAN DOG SWIM? "+swimmerDog2.isSwim());
            
            $:System.out.println("INSIDE LABEL");
            $1:for(int i = 0; i <4; i++){
                $2:System.out.println("Print inside for: "+i);
                break $1;
            }
                
            double dd = 0x1f;
                Fox fox = new Fox();
                
        
                // Some Casting exercises
                int myInt = (int)1211111111111111l;
                double myF = (float)12.2;
                // Puppy pupp = (Puppy)new Dog();
                
                Object obj = new Object();
                
                // END OF CASTING EXERCISES
                
                Integer intWrap = 0;
                try{
                    intWrap = Integer.valueOf("01",Character.MIN_RADIX);
                }catch(NumberFormatException nfe){System.out.println(nfe);}
        
                Integer intWrap2 = 0b101;
                System.out.println("intWrap: "+intWrap+" intWrap: "+intWrap2);
                
                // PLAYING WITH EXCEPTIONS:
                

                String str = "Hola";
                try{str.charAt(10);}
                catch(Exception e){System.out.println(e);} 
                // Prints: 
                // java.lang.StringIndexOutOfBounds: String index out of range: 10

                String[] holdDogs = new String[3];
                List<Dog> dogs = new ArrayList<>();
                dogs.add(new Dog());
                System.out.println("Dogs List to String! "+dogs.toString());
                System.out.println("Dogs List print! "+dogs);
                System.out.println("Dogs List print! "+dogs.toArray());
                
                Dog saveDog = dogs.get(0);
                dogs.remove(0);
                
                System.out.println("SAVED A DOG! "+saveDog);
                
                try{dogs.get(2);}
                catch(IndexOutOfBoundsException e){System.out.println(e);}
                // Prints: 
                // java.lang.IndexOutOfBoundsException: Index: 2, Size: 1
                
                Dog[] dogs2 = {new Dog(), new Dog()};
                try{dogs2[2].status = "Alive";}
                catch(Exception e){System.out.println(e);}
                // Prints: 
                // java.lang.ArrayIndexOutOfBoundsException: 2
            
                try{Dog[] dogggg = new Dog[-2];}catch(Exception e){}
                
                for(int i = 0; i < 4; i++,i--,++i,i=4,i++,System.out.println("Hola"+i)){}
                
                float f = 2.0f; // So a double cannot be converted to a float.
                float f2 = 1; // An int CAN be converted to a float.
                double d = 1;
                System.out.println("INT TO FLOAT: "+f2);
                System.out.println("INT TO DOUBLE: "+d);
                
                float f3 = 2.0f;
                
                
                Dog perro = new Dog();
                System.out.println(perro.deepTest(1,2));
                
                Cat cat = new Cat();
                GGPredicate.predicate();
                
		Dog marduk = new Dog("Dead");
		Dog ballack = new Dog("Alive");
                
		isNewDog(a -> a.status.equals("Alive"), ballack);
                isNewDog(a -> {return true;}, ballack);
                isNewDog(a -> true, ballack);
                isNewDog(a -> {int b = 1; return true;}, ballack);
                // WRONG isNewDog(a -> int b = 1; true;, ballack);
                
                Puppy pup = new Puppy();
                Puppy pup2 = new Puppy(5);
                Dog pup3 = new Puppy(2);
                Dog pup4 = new Puppy(2);
                Dog doggo = new Dog();
                
                pup.puppyAttack();
                pup.dogAttack();
                
                System.out.println(pup.age);
                System.out.println(pup2.age);
                
                
                System.out.println("------\n PROTECC!\n");
                System.out.println("1. DAMAGE REDUCED: "+pup2.protecc((byte)10, 2)+"\n"); // Executes overloaded method.
                System.out.println("2. DAMAGE REDUCED: "+pup2.protecc(10l, 2)+"\n"); // Executes overloaded method.
                System.out.println("3. DAMAGE REDUCED: "+pup2.protecc(10, 2)+"\n"); // Executes overriding method.
                System.out.println("4. DAMAGE REDUCED: "+((Dog)pup2).protecc(10, 2)+"\n"); // Executes puppy overriding method at runtime
                System.out.println("5. DAMAGE REDUCED: "+((Dog)pup3).protecc(10, 2)+"\n"); // Executes puppy overriding method at runtime.
                System.out.println("5. DAMAGE REDUCED: "+pup4.protecc(10,2)+"\n"); // Executes puppy overriding method at runtime.
                System.out.println("6. DAMAGE REDUCED: "+((Dog)doggo).protecc(10, 2)+"\n"); // Executes Dog method at runtime.
                System.out.println("7. DAMAGE REDUCED: "+doggo.protecc(10, 2)+"\n"); // Executes Dog method at runtime.
                System.out.println("8. CLASS TYPE: "+((Dog)pup3).getClass()+"\n"); // Executes Dog method at runtime.
                System.out.println("9. CLASS TYPE: "+doggo.getClass()+"\n"); // Executes Dog method at runtime.
                
                try{
                    System.out.println("10. DAMAGE REDUCED: "+((Puppy)doggo).protecc(10, 2)+"\n"); // Throws ClassCastException because a Dog cannot be cast to Puppy.
                }
                catch(ClassCastException cce){System.out.println("9. "+cce.getMessage());}
                
                int[] inarr = {1,2,3};
                int newInn = inarr[-1];
	}

    @Override
    public boolean test(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void backStyle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
