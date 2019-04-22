/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author gab12
 */
class Employee extends Person implements Worker{
    
	private int id;
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	} 

	public void works(){
		System.out.println("Working");
	}
}
