/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gab12
 */
public class Age extends ParentAge{
        static int _age = 20;
  
  		public Age(){}
  
        public Age(int _age)
        {
            this._age=_age;
        }
  
  public void run(){System.out.println(_age);}
  static public void walk(){System.out.println("Age Walk");}
}