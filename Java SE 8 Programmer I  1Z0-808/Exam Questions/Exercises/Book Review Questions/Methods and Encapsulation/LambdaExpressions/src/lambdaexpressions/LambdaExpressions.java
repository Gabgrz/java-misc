/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressions;

/**
 *
 * @author gab12
 */

interface MyInterface{
    boolean check(int i1, int i2);
}

public class LambdaExpressions {
    
    
    static boolean review(MyInterface my, int ii1, int ii2){
    	return my.check(ii1,ii2);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyInterface my;
        System.out.println(review((i1,i2) -> i1 > i2,6,2));
        
    }
    
}
