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
public class AClass implements AnInterface{
	AClass(){
		System.out.println("I am object "+this);
		System.out.println("Can I access interface constant? "+this.CONSTANT);
                System.out.println("What if I use super? ");
	}

	public static void main (String[] args){
		AClass myClass = new AClass();
		myClass.aMethod();
	}
}