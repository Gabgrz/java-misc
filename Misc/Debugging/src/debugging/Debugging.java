/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugging;

/**
 *
 * @author gab12
 */
public class Debugging {

    /**
     * @param args the command line arguments
     */
    
    public static void findAbc(String input) {
    int index = input.indexOf("abc");
    // System.out.println(index);
    while (true) {
        if (index == -1) {
            System.out.println(index);
            System.out.println("A CTION");
            break;
        }
        String found = input.substring(index+1, index+4);
        System.out.println(found);
        System.out.println(index);
        
        
        index = input.indexOf("abc", index+4);
        System.out.println("i1: "+index+1+" - i2: "+index+4);
        System.out.println("i1: "+index+1+" - i2: "+index+4);
        System.out.println("INPUT L: "+input.length());
        
        System.out.println("LAST INDEX: "+index);
    }   
}
   public static void test() {
     // findAbc("abcd");
     findAbc("abcdabc");
     // System.out.println("abcdabc".length())
}
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        test();
    }
    
}
