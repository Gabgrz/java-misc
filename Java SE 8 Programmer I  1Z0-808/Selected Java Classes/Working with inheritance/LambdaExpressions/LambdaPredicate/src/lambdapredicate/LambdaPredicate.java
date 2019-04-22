/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdapredicate;

import java.util.ArrayList;

strictfp public class LambdaPredicate implements Validate, Interface2{

	public boolean didPass(Student st){
		if(st.getNote() >= 65){
			System.out.print("STUDENT PASSED THE EXAM");
			return true;
		}
		else {System.out.print("STUDENT FAILED THE EXAM"); return false;}
	}

	void removeBelow40(ArrayList<Student> stList){

		stList.removeIf(s -> s.getNote() < 40);

	}

	
	public static strictfp void main (String[] args){

		LambdaPredicate lp = new LambdaPredicate();

		Student s1 = new Student("Gabriel", 100);
		Student s2 = new Student("Alex", 84);
		Student s3 = new Student("Ross", 64);
		Student s4 = new Student("Paty", 65);
		Student s5 = new Student("Janice", 14);
		Student s6 = new Student("Peter", 24);

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);

		System.out.println("All students: ");
		for(Student st : studentList){
			System.out.print(st.getName()+" - ");
			lp.didPass(st);
			System.out.println("");
		}

		Validate exceptional = st -> {return(st.getNote() == 100);};

		for(Student st : studentList){
			if(exceptional.didPass(st)){
				System.out.println("NAME: "+st.getName()+"\nSCORE: "+st.getNote());
			}
		}

		lp.removeBelow40(studentList);

		System.out.println("List without bad students: ");
		for(Student st : studentList){
			System.out.println(st.getName());
		}


	}
}