/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/**
 *
 * @author gab12
 */
public class ArrayListTest{

    static boolean checker(Predicate<List> p, List l){
        return p.test(l);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> al = new ArrayList<>();
        al.add("Hola");
        al.add("Hey");
        al.add("Hey ya");
        List<String> newAl = al.subList(1, 3); // Returns a List, not an ArrayList.
        // If the fromIndex value and toIndex value are the same, a blank List is returned. toIndex is EXCLUSIVE.
        System.out.println(al);
        System.out.println(newAl);
        
        al.addAll(newAl);
        System.out.println(al);
        
        System.out.println("PREDICATE: "+checker((List p) -> !al.isEmpty(), al));
        
    }
    
}

