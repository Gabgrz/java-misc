/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gab12
 */
public class ParentAge{
      
  	static int _age = 10;
	static private void run(){System.out.println(_age);}
  	static public void walk(){System.out.println("ParentAge Walk");}
  
  private void talk(){System.out.println("ParentAge Talk");}
    
        public static void main(String[]args)
            {
          
			ParentAge myAg = new Age();
          
          	myAg.run();
          	myAg.walk();
          
          	Age a = new Age();
            a.walk();
          
          	ParentAge pa = new ParentAge();
          	pa.talk();
          
          	Age aa = new Age();
          	// aa.talk(); talk method does not exist in Age.
          
          	System.out.println("----");
          
          myAg.run();
          
                Age[] age= new Age[10];
                int i=0;
                for(i=0;i<10;i++)
                    {
                        age[i]=new Age(i);
                        i++;
                    }
                for(int y=0;y<10;y++)
                    {
                        System.out.println(age[y]);
                    }
          }
  }
