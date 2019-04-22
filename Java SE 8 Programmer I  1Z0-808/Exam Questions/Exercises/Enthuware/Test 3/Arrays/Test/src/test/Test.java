/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author gab12
 */
public class Test {

    static final boolean BOOL;
    static{
        BOOL = true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(BOOL);
        System.out.println(2f);
        
        int x = 3;
        int arr[][][] = new int[x][x = 4][x+1];
        System.out.println(arr.length); // Prints 3
        System.out.println(arr[0].length); // Prints 4
        System.out.println(arr[0][0].length); // Prints 4
    }
}