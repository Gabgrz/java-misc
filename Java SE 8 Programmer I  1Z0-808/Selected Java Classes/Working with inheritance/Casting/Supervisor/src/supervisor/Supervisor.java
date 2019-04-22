/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supervisor;

import java.util.ArrayList;
/**
 *
 * @author gab12
 */
class Supervisor implements Interviewer {
	int teamSize;

	Supervisor(int teamSize){
		this.teamSize = teamSize;
	}

	public void conductInterview(){
		System.out.println("Conducting interview as Supervisor...");
	}

	public static void main (String[] args){
		ArrayList<Interviewer> interviewerList = new ArrayList<>();
		interviewerList.add(new Supervisor(11));
		interviewerList.add(new Supervisor(5));
		interviewerList.add(new HR());
		
		for(Interviewer i : interviewerList){
			if(i instanceof Supervisor){
				if(((Supervisor)i).teamSize > 10)
					i.conductInterview();
				else System.out.println("Supervisor not entitled to conduct interview");
			}
			else if (i instanceof HR) 
				i.conductInterview();
		}


	}

}
