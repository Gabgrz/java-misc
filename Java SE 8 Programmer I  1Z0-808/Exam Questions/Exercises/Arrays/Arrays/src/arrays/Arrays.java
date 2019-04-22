/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author gab12
 */
public class Arrays {

    static int[] returnArr(){
        int[] arr = {1,2,3};
        return arr;
    }
    
    static int[] returnNullArr() {
        int[] arr = {1, 2, 3};
        return null;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int index = 0;
        try{
            int first = returnArr()[0]; // It's possible to add brackets/index after calling a method that returns an array.
            System.out.println("First element: "+first);
            int second = returnNullArr()[index = 2]; // index = 2 evaluates before an Exception is thrown.
            System.out.println(index);
        }
        catch(NullPointerException npe){System.out.println(npe);}
        System.out.println("Index: "+index);
        
        String s[] = new String[2];
        String[] mess = new String[][]{{null},{"hulla"}}[0];
        
        
        String[][] s2 = new String[][]{{null,null},{"hulla"}};
        String[] neat = s2[0];
        String[] neat2 = s2[1];
        System.out.println(neat[0]+neat[1]);
        
    }
}
