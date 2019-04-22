/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;

/**
 *
 * @author gab12
 */
public class Varargs {

	static void method(int i, boolean... b){
		System.out.println(b[2]);
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	method(2, new boolean[3]);
    }
}