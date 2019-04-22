/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.lang.Exception;

/**
 *
 * @author gab12
 */
public class Exceptions {

	static int method() throws Exception{
		
		int ret = 10;
		int[] arrayInt = {1,2,3};
		try{
			System.out.println(arrayInt[5]);
		}
		catch (Exception e){
			System.out.println("Value not found");
			System.out.println(ret);
			// return ret;
		}
		finally{
                        ret += ret;
                        System.out.println(ret);
			
		}
                // ret = 30;
                    return ret;
	}

	public static void main(String[] args){
                
                try{
                    method();
                    System.out.println("Returned value from method: "+method());
                }
                catch (Exception e){
                    System.out.println("Catched!");
                }
                
                try{
                    throw new MyException();
                }
                catch (MyException me){System.out.println("Caught: "+me);}
	}
}