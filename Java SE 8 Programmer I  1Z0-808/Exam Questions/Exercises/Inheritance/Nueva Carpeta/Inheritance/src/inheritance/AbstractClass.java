/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author gab12
 */
abstract public class AbstractClass {
    static String staticString = "Hola";
    abstract void instanceFromAbstract();
    static void staticFromAbstract(){};
    
    public static void main2(String[] str){
        AbstractClass ac = null;
        // ac.instanceFromAbstract();
    }
}