/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gab12
 */
public class Misc {

    /**
     * @param args the command line arguments
     */
        
    static final int pot7 = 128;
    static final int pot6 = 64;
    static final int pot5 = 32;
    static final int pot4 = 16;
    static final int pot3 = 8;
    static final int pot2 = 4;
    static final int pot1 = 2;
    static final int pot0 = 1;
    
    static int[] pots = {pot0,pot1,pot2,pot3,pot4,pot5,pot6,pot7};
    

                
    static int toBinary (int decimal){
        int x = 0;
        byte b;
        int mod;
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < pots.length; i++){
            if(pots[i] > decimal){
              x = pots[i+1];
                System.out.println("FLAG 1");
                break;
            }
            System.out.println("FLAG 2");
            count++;
        }
        int diff = 7-5;
        for(int i = 0; i < diff; i++){
            sb.append("0");
        }
        
        // System.out.println(sb);
        while(x % 2 == 0){

            b = (byte)(Math.round(decimal/(x = x/2))+1);
            
            decimal %= 2;
            sb.append(b);
            
        }
        String finalBin = sb.toString();
        System.out.println(finalBin);
        return Integer.valueOf(finalBin);
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        float f = 4.111111111111f;
        float f2 = 99999999999999999999999999999999999999.99999999999999999999991131121212412412444444444444444444444444444444444124f;
        double dd2 = 999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99999999999999999999991131121212412412444444444444444444444444444444444124;
        double dd = 4.1;
        
        String ss = "Hey";
        String ss2 = "Hey";
        
        int arr[] = {1,2,3,4};
        int arr2[] = new int[]{1,2,3,4};
        
        int arr3[];
        arr3 = new int[]{1,2};
        
        int arr4[] = new int[3];
        int arr5[] = new int[0];
        arr5 = new int[]{1,2};
        
        Object obj = new int[]{12};
        
        System.out.println("FLOAT/DOUBLE EXERCISES\n\n"+(f == dd)+"\n");
        
        int bin = toBinary(60);
        System.out.println(bin);
        
        
        System.out.println("Bitwise shift EXERCISES");
        System.out.println(16 >> 3);
        
        StringBuilder sb = new StringBuilder("H");
        sb.append(22.0f);
        
        float myf = 2;
        double myd = 2;
        
        
        
        System.out.println("\nMORE FLOAT/DOUBLE EXERCISES");
        System.out.println(""+myf+" "+myd);
        
        byte b = 3;
        int h = 3;
        
        int i;
        int j;
        
        for(i = 1; i < 4; i++){
            for(j = 2; j < 4; j++){
                if(j == 3)
                continue;
                System.out.println("i:"+i+" j:"+j);
                
            }
        }
        Number a = 60; // Number Wrappers are not object. They extend Number, which implements Serializable.
        
        int num = 4;
        final int numf = 4;
        
        
        System.out.println("\nSWITCH EXERCISE");
        
        for(int i2 = 0; i2 < 2; i2++){
            System.out.println(i2);
            if(i2 == 1) {
                System.out.println("Flag");
                num = 3;}
            switch(num){
                case 10/3: System.out.println("3 "+10/3);
                num = 4;
                break;
                case numf: System.out.println("FOUR");
                
            }
        }
        
    }
}

