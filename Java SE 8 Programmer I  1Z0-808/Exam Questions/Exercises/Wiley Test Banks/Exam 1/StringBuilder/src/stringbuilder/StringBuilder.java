/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder;

/**
 *
 * @author gab12
 */
public class StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.lang.StringBuilder sb1 = new java.lang.StringBuilder("Hey");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Hey");
        java.lang.String s1 = new java.lang.String("Hey");
        java.lang.String s2 = new java.lang.String("Hey");
        
        System.out.println(sb1.equals(sb2)); // StringBuilder does not override equals() from Object class.
        System.out.println(s1.equals(s2)); // String DOES override equals() from Object class.
    }
}