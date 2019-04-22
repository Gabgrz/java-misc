/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author gab12
 */
public class A {

    public static void sM1() {
        System.out.println("In base static");
    }
}

class B extends A {

    public static void sM1() {  System.out.println("In sub static"); }  
    // public  void sM1() {  System.out.println("In sub non-static"); }  
}