/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

import java.util.function.Predicate;
/**
 *
 * @author gab12
 */
interface GGPredicate<Dog> extends Predicate<Dog>{
    static void predicate(){System.out.println("Predicate method");return;}; // Not related to Dog. Dog does not inherit this method.
    
    
    default void deepTest(){}
    default void deepTest(int a){}
    default String deepTest(int a, int b){return "Deep Test";}
    default void deepAnalysisTest(){}
}