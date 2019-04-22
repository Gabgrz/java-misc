/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author gab12
 */
public class Test {

    final int i;
    
    
    Test(){
        i = 2;
    }
    
    Test(int x){
        this();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {2};
        int i = 2;
        i += (i = 4) + (i+4); // 2 + 4 + 8
        arr[0] += arr[0] = 4 * arr[0]+4;
        // 2 + (arr[0] = (4 * arr[0]) + 4)
        // 2 + 8 + 4
        System.out.println("i: "+i+"\narr[0]: "+arr[0]);
    }
}