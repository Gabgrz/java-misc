/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author gab12
 */
class Class{
	Class classs;
        
	public static void main (String[] args){
		Class myC = new Class();
		Class myC2 = new Class();
		myC.classs = myC2;
		myC = null;
		// System.out.println(myC.hashCode());
		System.out.println(myC2.hashCode());
	}
        
}