/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblocks;

/**
 *
 * @author gab12
 */
public class StaticBlocks {
    
    final static int myInt;
    static{
        myInt = 10;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // myInt = 5; Won't compile
    }
    
}
