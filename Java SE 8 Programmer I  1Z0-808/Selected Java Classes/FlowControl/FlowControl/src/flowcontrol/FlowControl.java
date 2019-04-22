/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowcontrol;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

/**
 *
 * @author gab12
 */
public class FlowControl {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    
    static int even(){
        return 2;
    }
    
    static int odd() {
        return 1;
    }
    
    // Remember, a method cannot be declared inside another method.
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ter = (true == true)?100 : 200;
        System.out.println(ter);
        
        int ter2;
        
        ter2 = (true==false)?150 : 250;
        System.out.println(ter2);
        
        // Preceding code is the same as
        
        ter2 = true==false?150 : 250;
        System.out.println(ter2);
        
        // Assign expressions with ternary construct
        
        int ter3 = true==true?100+100 : 200+200;
        System.out.println(ter3);
        
        // Assign int value of whether method to initialize variable
        
        int oddOrEven = (2==2)?even():odd();
        System.out.println(oddOrEven);
        
        // Ternary construct needs all three parts: boolean evaluation, value returned if true and block if false
        // Ternary construct RETURNS a value, so it MUST be assigned to a value.
        // Ternary returns cannot be in a block.
        // Because it MUST return a value, a method that does not return anything (void) cannot be passed.
        
        Long lon = (true==true)?2l : 4;
        System.out.println(lon);
        
        Object lon2 = (true==true)? new Integer(2) : new Integer(4);
        System.out.println(lon2);
        
        // It is possible to next a ternary construct
        
        int hm = (true==true)? (true==false)? 10 : 20 : 30;
        
        // This is the same as:
        
        hm = (true==true)? 
                (true==false)? 
                    10 
                    :20 // Prints 20 
                :30;
        
        System.out.println(hm);
        
        
        // NEST three ternary constructs
        
        int tripleTer = (true==true)? (true==true)? (true==false)?10:20:30:40;
        System.out.println("NESTED TERNARY: "+tripleTer);
        
        // Preceding statement is same as below, but more readable and with proper identation:
        
        int tripleTerIdented = (true==true)? 
                                    (true==true)? 
                                        (true==false)?
                                        10 :20
                                    :30
                                :40;
        
        System.out.println("NESTED TERNARY IDENTED: "+tripleTerIdented);
        
        // ANOTHER TERNARY CONSTRUCT
        
        int bill = 2000;
        int qty = 10;
        int dayz = 10;
        int val = bill >1000? qty > 11 ? 10 : dayz > 9? 20 : 30 : 5;
        // TRANSLATES TO FOR BETTER READABILITY:
        int va2 = (bill > 1000)?
                    (qty > 11)?
                        10
                        : (dayz > 9) ? 20 : 30
                    :5;
        
        // Leave full ternary expression in the last ternary construct
        
        System.out.println(va2);
        
        String hey = "hey";
        
        switch(hey){
            case "heyy": 
            case "hey": 
            case "hello": 
                System.out.println("Line found"); 
                break; // IF no break is placed, default block will be executed too. It executes everything until switch statement ends.
            default: 
                System.out.println("No string was found");
        }
        
        final String obS = new String("HoyEsEl");
        final String comS = "Hoy";
        final String conc = comS+"Es";
        final String ref = conc+"El";
        switch (obS){
            case comS: System.out.println("FOUND");
                        break;
            case conc: System.out.println("CONCATENATED: "+conc);
                        break;
            case ref: System.out.println("CONCATENATED: " + ref);
                        break;
        }
        // So switch uses equals() method and behaves just as equals() implemented in the String class.
        
        int count = 0;
        char c = '1';
        String st = "Hola";
        Object anObject = null;
        int fromMethod = 0;

        
        for (int a = 10, b = 20; a < b; a++, b--, count = 4, c = 'a', st = "noHola", anObject = null, fromMethod = odd()){
            System.out.println(count++);
            System.out.println(c);
            System.out.println(st);
            System.out.println(anObject);
            System.out.println(fromMethod);
            // REMEMBER! If a primitive variable will be used, it has to be initialized!
            
        }
        
        for(;;) {
            System.out.println("Hola es un for hehe"); 
            break;}
        
        // Create a multidimensional Array and add values to it with a nested for
        
        String s = "[] ---> ";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
            sb.append(" ");
        
        int[][] multiArr;
        multiArr = new int[2][3];
        for(int x = 0; x < multiArr.length; x++){
            System.out.println(s);
            for(int y = 0; y < multiArr[x].length; y++){
                multiArr[x][y] = y;
                System.out.print(sb+"["+multiArr[x][y]+"]\n");
            }
            System.out.println("");
        }
        
        
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Paul");
        list.add("John");
        list.add("Cole");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Stain");
        list2.add("Darling");
        list2.add("Peter");
        
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Robert");
        list3.add("Viktoria");
        list3.add("Sandra");
                
        for(Iterator<String> i = list.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
        
        // When using the Iterator class, evaluation on items is determined by method hasNext(), which returns true if there is an object next.
        // To obtain the object, use next(), which return the next object.
        
        System.out.println("\n\nIterating over with Enhanced For Loop:");
        for (String a : list){
            System.out.println(a);
        }
        
        // Print all list elements using a nested foor loop
        // First, add all three lists into a list.
        
        ArrayList<ArrayList<String>> allLists = new ArrayList<ArrayList<String>>();
        allLists.add(list);
        allLists.add(list2);
        allLists.add(list3);
        
        System.out.println("\n\nIterating over with NESTED Enhanced For Loop:");
        
       for(ArrayList<String> okList : allLists){
           
            for(String ss : okList){
                System.out.println(ss);
            }
        
        }

        int[][] aArr;
        aArr = new int[1][1];
        aArr[0][0] = 1;
        
        int[][] mArr = new int[2][];
        // mArr[1][0] = 2;
        // System.out.println(mArr[1].length);
        
        System.out.println(" ");
        // DIFF. BETWEEN PASSING A PRIMITIVE VALUE AS FOR LOOP VARIABLE VS PASSING AN OBJECT AS FOR LOOP VARIABLE
        
        int[] intArr = {1,2,3};
        StringBuilder[] sbArr = {new StringBuilder("A"), new StringBuilder("B"), new StringBuilder("C")};
        
        for(int num : intArr){
            num = 4;
            System.out.println(num);
            System.out.println(""+intArr[0]+" "+intArr[1]+" "+intArr[2]);
        }
        
        for(StringBuilder sbb : sbArr){
            sbb.append("-MODIFIED");
            System.out.println(sbb);
            System.out.println(""+sbArr[0]+" "+sbArr[1]+" "+sbArr[2]);
        }
    
        // NESTED COLLECTION VS NESTED LOOP. THE FOLLOWING IS A NESTED LOOP:
        
        ArrayList<String> liS = new ArrayList<String>();
        ArrayList<String> liS2 = new ArrayList<String>();
        ArrayList<String> liS3 = new ArrayList<String>();
        
        liS.add("Outer ONE");
        liS.add("Outer TWO");
        
        liS2.add("Inter ONE");
        liS2.add("Inter TWO");
        
        liS3.add("Inner ONE");
        liS3.add("Inner TWO");
        
        // Task. print all elements using nested enhanced for loop
        
        for(String so : liS){
            for(String se : liS2){
                for (String si : liS3) {
                    System.out.println(so+" "+se+" "+si);
                }
            }
        }
        
        for(int i = 0; ++i < 2;)
            System.out.println("HEY: "+i);
            System.out.println("OUT OF FOR");
            
        int anInt;
        int[] anArr = new int[]{};
        int[] anArr2;
        
        label: {
            anInt = 5;
            System.out.println(anInt);
            anArr2 = new int[]{1,3};
            
            {System.out.println("Hola");}
            
        }
    }
}
