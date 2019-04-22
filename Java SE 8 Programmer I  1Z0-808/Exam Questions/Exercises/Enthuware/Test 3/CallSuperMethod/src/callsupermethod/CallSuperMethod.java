/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callsupermethod;

/**
 *
 * @author gab12
 */
public class CallSuperMethod {

    static int doSmth(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
    
    int reDoSmth(int x, int y) {
        return this.doSmth(x, y);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B c = new C();
        CallSuperMethod csm = new CallSuperMethod();
        
        System.out.println(c.doSmth(10, 20));
        System.out.println(csm.reDoSmth(100, 120));
        
    }
    
}

// It's possible to have multiple Classes within one .java file as long as there is only one Public class.

class A{
    int doSmth(int x, int y){
        if (x >= y) return x;
        else return y;
    }
}
class B extends A{
	int doSmth(int x, int y){
    	return 2 * super.doSmth(x,y);
	}
}
class C extends B{
    int doSmth(int x, int y){
    	return super.doSmth(2*x, 2*y);
    }
}

/* 
1. doSmth() of C is called.
2. Returns super method doSmth(x,y).
    It passes 10*2 (20) as x argument, and 20*2 (40) as y argument.
3. doSmth() of B runs.
    It multiplies the result of super (C) doSmth() method by two.
4. doSmth() of C runs.
    if x >= y return x, otherwise return y.

*/