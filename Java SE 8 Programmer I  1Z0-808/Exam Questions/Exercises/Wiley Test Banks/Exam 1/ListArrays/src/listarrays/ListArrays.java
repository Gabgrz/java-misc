/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gab12
 */
public class ListArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = Arrays.asList("a","b","C","d","A","Z","c","Hola","perro","ala");
        System.out.println(list);
        Collections.sort(list); // Sorts in natural order, capital letters first.
        String s1[] = (String[])list.toArray(); // Casting Object[] to String[] so that it can be assigned to s1[].
        String s2[] = list.toArray(new String[3]);
        System.out.println(list);
        System.out.println("S1: "+Arrays.toString(s1));
        System.out.println("S2: "+Arrays.toString(s2));
    }
}
