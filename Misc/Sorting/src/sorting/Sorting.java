/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;


/**
 *
 * @author gab12
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {4,11,5,1,14,2,7,10,9,8,6,3,12,13};
        int len = arr.length;
        int small = arr[0];
        int i;
        int index = 0;
        int indexFound = 0;
        int bin = 0;
        
        while(index < len-1){
            
            bin = 0;
            small = arr[index];
        
        for(i = index; i < len-1; i++){
            System.out.println("Comp "+arr[i+1]+" to "+small);
            if(arr[i+1] < small){
                small = arr[i+1];
                indexFound = i+1;
                bin = 1;
            }
            else if(arr[i+1] == small){
                bin = 0;
                break;
            }
        }
        
        System.out.println("Smallest is"+small);
        
        if(bin == 1){
            int toSwap = arr[index];
            arr[index] = small;
            arr[indexFound] = toSwap;
        }
        index++;
        
        System.out.println(Arrays.toString(arr));
        
        }
        
        System.out.println(Arrays.toString(arr));
        
           
        
        }        
        
        /* Pseudocode
        First find smallest number
        When smallest is found, swap it with the number at
        current index.
        
        FOR until length - 1
        
        
        
        */
        
        
        
    
    
}
