/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initorder;

/**
 *
 * @author gab12
 */
public class InitOrder {
    
        double dd(){
            return 2;
        }
    
    
        public static void main(String[] args) {
        // TODO code application logic here
        
        double d = 2;
        int i = (int)d;
        i = (int)2f;
        
        float f = 2;
        float f2 = 3.0f;
        // NOT ALLOWED: f2 = 3.0;
        f2 = (float)3.0;
        
        float f3 = f2;
        d = f3;
        
        
        
        
        double dd1 = 2f;
        double dd2 = 2.0;
        System.out.println("Static print inside main() method");
        InitOrder io = new InitOrder();
        InitOrder io2 = new InitOrder();
        System.out.println("DD METHOD RETURN: "+io2.dd()+" INT: "+2.0+" FLOAT: "+(float)2.0f+" DD1: "+dd1+" DD2: "+dd2);
    }

    static{
        new InitOrder().printInstance(10);
        print(2);
        main(new String[]{"Hello","hi"});
        System.out.println("Static initializer");
    }
    
    int numero;
    {System.out.println(numero);}
    
    InitOrder(){
        System.out.println("Constructor");
    }
    
    void printInstance(int num){
        System.out.println(numero); 
        System.out.println(this.numero = num);
    }
    
    static void print(int num){System.out.println(num);}
    
    /**
     * @param args the command line arguments
     */

    
}