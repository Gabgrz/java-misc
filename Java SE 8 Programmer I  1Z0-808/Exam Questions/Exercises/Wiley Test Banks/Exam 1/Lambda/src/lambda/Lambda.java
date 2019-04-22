/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author gab12
 */
public class Lambda {

    static boolean check(Climb c, int height){
        if(c.isTooHigh(height, 10)){
            System.out.println("It is too high!");
            return true;
            }
        else{ System.out.println("It's ok!"); return false;}
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(check((h,l)-> h>=l,9));
    }
}