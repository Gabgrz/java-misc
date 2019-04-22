/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;


import static dog.Dog.main;
import static dog.Dog.*;
import static dog.Puppy.*;
import dog.Puppy.*;
/**
 *
 * @author gab12
 */
public class Cat {
    
    static{
        System.out.println("Static initializer from Cat: ");
        breathe();
        try{bark();} catch(RuntimeException re){}
        
        System.out.println("END OF CAT STATIC INIT: ");
        // main(new String[]{"a","a"});
    }
    {
        //
    }
}