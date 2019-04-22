/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclass;

/**
 *
 * @author gab12
 */
interface AnInterface{
	int CONSTANT = 555;
	default void aMethod(){
		System.out.println("Interface object: "+this);
		System.out.println("Interface constant: "+this.CONSTANT);
	}
}
