/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsplayground;

/**
 *
 * @author gab12
 */

// This programs throws all sorts of Exceptions covered in the Java SE 8 OCA exam.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.System;
import java.lang.ExceptionInInitializerError;

public class ExceptionsPlayground {
    
    // ExceptionInInitializerError
    
    
    
    int excMethod(){
        int num = 2;
        try{
            throw new FileNotFoundException();
        }
        catch(Exception e){
            println("ONE");
            println(num);
            return num;
        }
        finally{
            num += num ;
            println("TWO");
            println(num);
            
        }
       // return num;
    }
    
        StringBuilder excMethod2(){
        StringBuilder sb = new StringBuilder("Name");
        try{
            throw new FileNotFoundException();
        }
        catch(Exception e){
            return sb;
        }
        finally{
            sb.append("GRZ");
            
        }
       // return num;
    }
    
    static{
        try{print(1/0);} catch(ArithmeticException e){} 
    }
    
    
    static{
        try{
            // print(1/0);
            
        }
        catch(ExceptionInInitializerError eiie){}
    }
    
    // static int num = 1/0;
    static{
        try{
            FileInputStream fis = new FileInputStream("marduk.txt");
        }
        catch(IOException ioe){}
    }
    
    static{
        try{
            throw new StackOverflowError();
        }
        catch(Throwable e){}
    }
    
    static void print(Object obj){
        System.out.print(obj);
    }
    
    static void println(Object obj) {
        System.out.println(obj);
    }
    
    public class Ink{
        String color;
        String getColor() {
            return color;
        }
    }
    public class ColorInk extends Ink{
        String color = "Color ink";
        String getColor(){
            return color;
        }
    }
    public class BlackInk extends Ink{
        String color = "Black ink";
    }

    /**
     * @param args the command line arguments
     */
    
    public class User{
        private String username;
        private String password;
        
        public String getUsername(){
            return username;
        }
        public String getPassword() {
            return password;
        }
        
        public void setCreds(String username, String password) throws IllegalArgumentException {
            if (username == null || username.length() < 6) {
                throw new IllegalArgumentException("Username:" + username + " cannot be empty or less than 6 characters");
            }
            if (password == null || password.length() < 8) {
                throw new IllegalArgumentException("Password:" + password + " cannot be empty or less than 8 characters");
            }
            this.username = username;
            this.password = password;
        }
        
        public void validateCreds(String username, String password){
            if(this.username.equals(username) && this.password.equals(password)){
                System.out.println("Login accepted. Proceed to do mad things");
            }
            else{throw new IllegalArgumentException("INVALID CREDENTIALS BRO");}
        }
        
    }
    
    // NullPointerException exc.
    
    static ArrayList<String> staticList;
    private ArrayList<String> privateList;

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double dd = 0.0/0.0;
        println(0.0/0.0+""+dd);
        
        // ClassCastException:
        ExceptionsPlayground ep = new ExceptionsPlayground();
        
        System.out.println("ClassCastException");
        
        ArrayList<Ink> inkList = new ArrayList();
        inkList.add(ep.new ColorInk());
        inkList.add(ep.new BlackInk());
        Ink newInk = inkList.get(0);
        System.out.println(((ExceptionsPlayground.ColorInk)newInk).getColor());
        System.out.println((newInk.getColor()));
        if(inkList.get(0) instanceof BlackInk){
            Ink newInk2 = (BlackInk)inkList.get(0); // Throws RuntimeException ClassCastException because a ColorInk cannot be casted to a BlackInk.          
        } // WEIRD! If I don't enclose this if block with braces, the variable declaration won't work.
        
        System.out.println("\nNullPointerException EXCERCISE\n");

        try{
            staticList.get(0); // Throws NullPointerException because List was never initialized, thus by default points to null (no value assigned).
            // Static context cannot access instance variable privateList.get(0);

            // However, static context can access instance variable through a new object ExceptionsPlayground().
            ExceptionsPlayground obj = new ExceptionsPlayground();
            obj.privateList.get(0); // Again, NullPointerException is thrown.
        }
        catch(NullPointerException npe){}
        
        System.out.println("Accessing an Array of Strings that's not initialized");
        
        try{
            String[] stringArr = null;
            System.out.println(stringArr[1]);
        
        
        String[] sArr2 = new String[3];
        System.out.println(sArr2[1]); // Prints null. Each String in Array is initialized to null.
        System.out.println(sArr2[1].length()); // Throws exception because cannot get length from a null value.
        
        }
        catch(NullPointerException npe){}
        
        System.out.println("\nArithmeticException EXCERCISE\n");
        
        
        
        int a = (int)0.9;
        int b = (int)0.8999;
        try{System.out.println(""+a+"/"+b);}
        catch(ArithmeticException ae){
                System.out.println(a/b);}
                
        System.out.println(23.3/0);
        System.out.println(-23.3/0);
        System.out.println(0.0/0);
        System.out.println(-23/0.0);
        
        int in = 2;
        double d = in;
        System.out.println(d);
        println(in+" "+d);
        
        System.out.println("\nNumberFormatException EXCERCISE\n");
        
        println(Integer.parseInt("123"));
        println(Integer.parseInt("-123"));
        println(Integer.parseInt("+123"));
        try{print(Integer.parseInt("+23ad"));}catch(NumberFormatException nfe){}
        println(Integer.parseInt("23ad",16));
        
        println("\n"+ep.excMethod());
        println("\n"+ep.excMethod2());
        
        System.exit(0);
        
        System.out.println("\nIllegalArgumentException EXCERCISE\n");
        
        Scanner sc = new Scanner(System.in);
        User newUser = ep.new User();
        
        System.out.println("Enter username: ");
        String userIn = sc.nextLine();
        System.out.println("Enter password: ");
        String passIn = sc.nextLine();
        newUser.setCreds(userIn, passIn);
        
        System.out.println("YOU SIGNED UP SUCCESSFULLY!");
        System.out.println("Username: "+newUser.username+"\nPassword: "+newUser.password);
        
        System.out.println("LOGIN \nEnter username:");
        String userLogin = sc.nextLine();
        System.out.println("Enter password");
        String passLogin = sc.nextLine();
        
        newUser.validateCreds(userLogin, passLogin);
        
        
        

    }
}
