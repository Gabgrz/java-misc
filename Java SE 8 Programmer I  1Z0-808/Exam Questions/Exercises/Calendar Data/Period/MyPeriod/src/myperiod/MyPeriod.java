/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myperiod;
import java.time.Period;
/**
 *
 * @author gab12
 */
public class MyPeriod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Period p = Period.parse("-P5Y");
        Period p2 = Period.parse("P-5Y");
        Period p3 = Period.parse("-P-5Y");
        Period p4 = Period.parse("-P5Y30M25d"); // Adding minus before P (Period) negates each value from the CharSequence.
        Period p5 = Period.parse("-P-5Y");
        Period p6 = Period.parse("-P-5W"); // Are translated into days by multipying by 7.
        
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p5);
        System.out.println(p6);
        
        
        
    }
    
}
