/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author gab12
 */

class Parent{
    public int setI1(int i){return i1 = i;}
    protected void m2(){}
    void m3(){}
    private void m4(){}

    public int i1;
    protected int i2;
    int i3;
    private int i4;
    
    int i = 2;
    double d = (double)i;

}

public class Inheritance extends Parent{
    
 	public Inheritance(){
 		i1 = 1; // Can initialize variable as this is an instance context.
 		i2 = 2; // Can initialize variable as this is an instance context.
 		i3 = 3; // Can initialize variable as this is an instance context.
 		// i4 = 4; 
 		// Failes to compile
 	} 

 	public void doSmth(){
 		i1 = 11; // Can change value as this is an instance context.
 		i2 = 12; // Can change value as this is an instance context.
 		i3 = 13; // Can change value as this is an instance context.
 	}
        
        static void staticMethod(){
            
        }
        
        public void callParentSet(){
            setI1(21);
        }
        
        float value1 = 102;
    float value2 = (int) 102.0;
    float value4 = 1f * ((short) 0.0);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inheritance i = new Inheritance();
        System.out.println(i.i1+" "+i.i2+" "+i.i3);
        i.doSmth();
        System.out.println(i.i1+" "+i.i2+" "+i.i3);
        i.callParentSet();
        System.out.println(i.i1+" "+i.i2+" "+i.i3);
    }
}