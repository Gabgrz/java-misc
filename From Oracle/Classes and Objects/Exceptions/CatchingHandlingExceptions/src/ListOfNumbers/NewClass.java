/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListOfNumbers;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NewClass {
    private List<Integer> list;
    private static final int SIZE = 10;

    public NewClass () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    
    public void readList(String path){
        
     /*   try{
            Scanner s = new BufferedReader(new FileReader(path));
            while(fr.read() != -1){
                System.out.print((Integer)fr.read());
            }
            

            
        }
        catch(IOException e){
            e.getMessage();
        }
        
        
        
    }*/
    

    
}
  }