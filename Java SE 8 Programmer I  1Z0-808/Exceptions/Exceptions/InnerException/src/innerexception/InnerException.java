/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerexception;

/*
 *
 * @author gab12
 */

import java.io.*;

public class InnerException{
	
        static FileInputStream student;
        static FileInputStream coach = null;
	static public void main (String[] args) throws RuntimeException{

                
		try{
			student = new FileInputStream("student.txt");
			try{
				coach.close();
                                System.out.println("Close line");
			}
                        catch (Exception e) {
                            System.out.println("File was not initialized");
                        }
			
				System.out.println("Coach file not found");
			

		}
		catch (FileNotFoundException fnfe){
			System.out.println("File not found");
		}
		catch (Exception npe){
			System.out.println("Null pointer exception");
		}
		finally{System.out.println("Release all resources");}
	}
}
