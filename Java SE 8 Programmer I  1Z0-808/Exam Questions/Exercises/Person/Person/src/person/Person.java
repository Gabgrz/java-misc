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
public class Person{
	protected String name;
	protected int age;

        Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
        
        static Employee replaceEmployee(Object ob){
            Person newEmp =  (Person)ob;
            newEmp.name = "Harry";
            newEmp.age = 22;
            ((Employee)newEmp).setId(2000);
            return (Employee)newEmp;
        }

	public static void main (String[] args){
            
            Long lon2 = 22l;
            // Long lon = 22; 
            // Does not compile because an Integer cannot be boxed to a Long object variable.

            System.out.println("\n CASTING EXERCISES: \n");
            Person p = new Person("Gab", 27);
            Employee em = new Employee();
            em.setId(10010);
            System.out.println("Person: \nName: "+p.name+"\nAge: "+p.age);
            System.out.println("Employee: \nName: "+em.name+"\nAge: "+em.age+"\nID: "+em.getId()+"\n");
           
            // Employee em2 = new Person(); 
            // Indeed, a person cannot be converted into an Employee.
            
            try{
            Employee em2 = (Employee)(new Person()); // RIGHT. Person cannot be cast to person.Employee, as EXPECTED.
            em2.setId(1002);
            System.out.println(em2.getId());
            }
            catch(ClassCastException cce){System.out.println(cce.getMessage());}
            
            // Now let's try to cast Object to Employee.
            
            try{
                Object obj = new Object();
                Employee em3 = (Employee) obj;
                System.out.println(em3.getId());
            }
            catch(ClassCastException cce){System.out.println(cce.getMessage());}
            
            Employee newEmp = replaceEmployee(em);
            System.out.println("Employee: \nName: "+newEmp.name+"\nAge: "+newEmp.age+"\nID: "+newEmp.getId()+"\n");
            System.out.println("Employee: \nName: "+em.name+"\nAge: "+em.age+"\nID: "+em.getId()+"\n");
	}
}