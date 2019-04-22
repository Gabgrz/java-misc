/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rethrown;

import java.io.*;
/**
 *
 * @author gab12
 */
public class Rethrown{
	
	static void myMethod(){

		try{
			FileInputStream fis = new FileInputStream("soccer.txt");
		}
		
		catch (FileNotFoundException e){
			System.out.println("File not found");
			System.out.println("Object: "+e.hashCode());
                        try{
                            throw e;
                        }
                            catch(FileNotFoundException ee){}
		}
		finally{

		}
		return;
	}

	public static void main (String[] args){
            
            
		myMethod();
            
            
            //    System.out.println("Main object: "+e.hashCode());
            

	}
}
