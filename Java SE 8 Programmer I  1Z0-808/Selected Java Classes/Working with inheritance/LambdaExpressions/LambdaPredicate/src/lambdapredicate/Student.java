/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdapredicate;

/**
 *
 * @author gab12
 */
public class Student{
	String name;
	int note;

	Student(String name, int note){
		this.name = name;
		this.note = note;
	}

        String getName(){
            return name;
        }
        
	int getNote(){
		return note;
	}

}