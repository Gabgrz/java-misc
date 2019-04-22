/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesterclasses;

/**
 *
 * @author gab12
 */
public class NesterClasses {
    
    private final int NUMBER = 0;
    private int x;
    int[] intArr = {0,1,2};
    int[] intArr2 = {};
    
    
    public NesterClasses(){
        
    }
    
    public NesterClasses(int x){
        this.x = x;
    }
    
    public class InnerClass{
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NesterClasses a = new NesterClasses();
        NesterClasses.InnerClass innerObject = a.new InnerClass();
        
        ShadowTest shadowTest = new ShadowTest();
        ShadowTest.FirstLevel objFirstLevel = shadowTest.new FirstLevel();
        objFirstLevel.methodInFirstLevel(23);
        
        
    }
    
}
