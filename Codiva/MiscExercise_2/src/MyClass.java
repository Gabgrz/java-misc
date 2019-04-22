/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gab12
 */

public class MyClass implements MyInterface {
  int number = 15;
  static Short shortReturn(){return new Short("20");}
  public static void main(String[] args) {
    Integer inter = new Integer(3);
    short ss = 5;
    Short shortt = new Short(ss);
    int i;
    System.out.println("Hello Codiva");
    SecondClass sc = new SecondClass();
    System.out.println(sc);
    if(sc != null) i = 5;
    else i = 10;
    System.out.println(i);
    long longVar = shortReturn();
    System.out.println("Short to long: "+longVar);
    int[] arr = {1,2};
    int[][] twoArr = new int[2][2]; // {{0,0},{0,0}}
    int[][] twoArr2 = new int[][]{{0,0},{0,0}};
    System.out.println("twoArr length: "+twoArr.length);
    twoArr[0] = new int[]{0,1,2,3,4};
	twoArr[0][4] = 5;
    System.out.println(twoArr[0][4]);
    for(int ii = 0; ii < twoArr.length; ii++){
      System.out.println("twoArr["+ii+"] Length: "+twoArr[ii].length);
    }
    boolean f = false;
    while(f){}
    System.out.println("Interface method: "+new MyClass().myMeth());
    
    StringBuilder sb = new StringBuilder(10);
    sb.append("Hola");
    System.out.println(sb);
    System.out.println(sb.length());
    
    // Ternary operator
    
    int a = 0;
    StringBuilder sb2 = a != 0 ? new StringBuilder("True SB") : new StringBuilder("False SB");
	System.out.println(sb2);
  }
}