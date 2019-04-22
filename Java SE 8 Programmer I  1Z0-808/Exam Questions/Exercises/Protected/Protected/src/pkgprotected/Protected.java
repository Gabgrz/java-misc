/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgprotected;
import protectedchild.ProtecChild;
/**
 *
 * @author gab12
 */
public class Protected extends ProtecChild {

    public Protected(){super();
           }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ProtecChild pc1  = new ProtecChild();
        Protected p = new Protected();
        ProtecChild pc = new ProtecChild(10);
        int i = pc.i2; // Can access public member.
        // int i2 = pc.i 
        // CANNOT access protected member, even if the calling object is of superclass type
    }
}
