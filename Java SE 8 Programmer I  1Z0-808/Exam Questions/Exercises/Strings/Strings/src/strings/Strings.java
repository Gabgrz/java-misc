/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author gab12
 */
public class Strings {

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Hey";
        System.out.println(str.hashCode());
        String str2 = "Hey2";
        str = "Hey3";
        
        System.out.println(str.hashCode());
        System.out.println("Hey".hashCode());
        System.out.println("Hey3".hashCode());
        
        
        // 1. A string "Hey" is created and assigned to object reference str.
        // 2. A string "Hey2" is created.
        // 3. A string "Hey3" is created and assigned to object reference str
        // "Hey" is an unique object with a hashCode, and there is no object pointing to it so it's eligible to be garbage collected.
        // 
        
        StringBuilder sb = new StringBuilder("eLion");
        String str3 = null;
        str3 = sb.append("x").substring(sb.indexOf("L"),sb.indexOf("x"));
        System.out.println(str3);
        
    }
    
}
