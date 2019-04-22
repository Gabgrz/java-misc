/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

/**
 *
 * @author gab12
 */
public class TestClass {

    public static void main(String args[]) throws Exception {
        Exception e = null;
        try{
            throw e;
        }
        catch(Exception ee){
            System.out.print(true + "Hola");
            System.out.print(Boolean.TRUE + "Hola");
        }
        finally{}
    }
}