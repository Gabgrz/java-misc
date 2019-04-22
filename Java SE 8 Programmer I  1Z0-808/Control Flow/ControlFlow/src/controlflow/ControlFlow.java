/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow;

/**
 *
 * @author gab12
 */
public class ControlFlow {

    private int p = 1;
    
    
    void aMethod(int[] ...args){}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] ...args) {
        
        ControlFlow cf = new ControlFlow();
        cf.p = 33;
        System.out.println(cf.p);
        
        int n = 0x123456;
        int n2 = 0X123456;
        int n3 = 0b1010101;
        int n4 = 0B1110001;
        int n5 = 0123456;
        int n6 = 010; 
        double d = 0_0.9;
        double d1 = 09.9f;
        long l = 100;
        System.out.println(d);
        System.out.println(d1);
        System.out.println(l);

        aflag:
        for(int i = 0; i < 10; i++){
            System.out.println("Flag outer: "+i);
            if(i == 3)
                break aflag;
            aflag2:
            while(++i < 5){
                if(i==3) continue aflag;
                System.out.println("Flag while ineer: "+i);
                if(i == 4) {
                    System.out.println("Hit flag 2!");
                    break aflag2;
                }
            }
        }
    }
}