/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.function.Predicate;

/**
 *
 * @author gab12
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    	// Predicate p = s -> s == "Hola" ? "Ok" : "Not ok"; 
        // It does try to return the values on the left.
        Predicate p = s -> s == "Hola";
    	System.out.println(p.test("Hola"));
    }   
}