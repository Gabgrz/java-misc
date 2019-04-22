/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsefloat;

/**
 *
 * @author gab12
 */
public class ParseFloat {

    /**
     * @param args the command line arguments
     */
    
    
    public float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("finally");
        }
        // return f; unreachable statement
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
    }
}