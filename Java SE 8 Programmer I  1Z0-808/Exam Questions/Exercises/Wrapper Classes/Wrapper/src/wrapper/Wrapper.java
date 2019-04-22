/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author gab12
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        
        
        // DIfferent ways of creating Wrapper objects.

        // 1. Using constructors
        Integer ic1 = new Integer(1); // takes int
        Integer ic2 = new Integer("1"); // takes String
        Integer ic3 = new Integer('c'); // takes int in the form of char.
        
        float f = ic2.floatValue();
        double d = ic2.doubleValue();
        
        System.out.println(f +" "+ d);
        // 2. Assigning primitive data types (autoboxing).
        Integer ia1 = 1;
        Integer ia2 = (int)'1'; // Char cast to int before assignment.
            // Not possible to assign a long value
            // Integer ia2 = 1l;
            
        // 3. Creating objects with Integral Number static methods.
        Integer is1 = Integer.valueOf("1"); // Arg takes String.
        Integer is2 = Integer.valueOf(1); // Arg takes int.
        Long ls2 = Long.valueOf(1l); // Long class takes a long primitive.
        Byte bs2 = Byte.valueOf((byte)1l); // Byte class takes a byte primitive.
        Integer is3 = Integer.valueOf("11111", 2); // Takes string and int for radix. 
        // String number is interpreteted in the number sysbem specified by the radix (from 2 to 36), then assigned to variable.
        Integer is4 = Integer.valueOf((int)1l); // Casting long to int is possible.
        
        System.out.println("IS4\n"+is4);
        System.out.println(++is4);
        System.out.println(is4++);
        System.out.println(is4);
        
        // Manipulating wrapper objects. How wrapper objects are immutables.
        
        Integer newInt = is4++;
        Integer yetInt = is4++;
        
        System.out.println("Same object reference? "+(newInt == is4));
        System.out.println("Equals? "+newInt.equals(is4));
        System.out.println(newInt + " "+is4+ " "+yetInt+"\n----------------------------");
        
        Integer iw1 = new Integer(1);
        Integer iw2 = iw1;
        System.out.println("Same reference? "+(iw2 == iw1));
        System.out.println("Equals? "+iw2.equals(iw1));
        iw1++;
        System.out.println("Same reference after postfix increment? "+(iw2 == iw1));
        System.out.println("Equals after postfix "+iw2.equals(iw1));
        
        // 4. Using parse static methods.
        int in1 = Integer.parseInt("1"); // Parsing string to primitive value.
        int in2 = Integer.parseInt("1", 2); // Takes string to parse and int for radix.
        // The string can contain - or + to specify whether the number is positive or negative.
        
        // *** Float and Double ***
        
        // valueOf()
        Double dv1 = Double.valueOf("+2"); // Takes a string.
        double dv2 = Double.valueOf(2); // Takes an int that's converted to double.
        double dv3 = Double.valueOf(2); // Takes a double literal.
        Float fv1 = Float.valueOf("-1.0"); // Taking a String (without postfix f)
        float fv2 = Float.valueOf("-1.0f"); // Taking a String (with postfix f)
        
        // parseXXX()
        double dp1 = Float.parseFloat("+3.0f"); // Takes String with + and f postfix and it's assigned to double variable.
        float fp2 = Float.parseFloat("3.0d"); // Takes String with d postfix and it works.

        // No possible to parseDouble and assign to float variable. Lossy conversion!
        // float fp3 = Double.parseDouble("2.9");
        
        // ** Boolean **
        
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean(true);
        
        // valueOf
        Boolean bv1 = Boolean.valueOf("true"); // valueOf String
        Boolean bv2 = Boolean.valueOf(true); // valueOf boolean
        
        // parseXXX
        Boolean bp1 = Boolean.parseBoolean("false");
        
        // ** Character **
        // valueOf
        Character cv1 = Character.valueOf('c'); // Takes a char
       
        
        
        
        // No parseXXX method,
        
    }
    
}

