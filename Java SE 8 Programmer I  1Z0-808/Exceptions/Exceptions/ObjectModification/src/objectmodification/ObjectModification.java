/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodification;

/**
 *
 * @author gab12
 */
import java.lang.Exception;

public class ObjectModification{

	static StringBuilder modifyObj(){

		StringBuilder sb = new StringBuilder("MyString");
		try{
			sb.substring(13,15);
		}
		catch (RuntimeException re){
			System.out.println("String is not that long");
			sb.append("Erroed");
			return sb;
		}
		finally{
			sb.append("-FINALLY");
		}	
		return sb;
	}

	public static void main(String[] args){

		System.out.println(modifyObj());

	}
}
