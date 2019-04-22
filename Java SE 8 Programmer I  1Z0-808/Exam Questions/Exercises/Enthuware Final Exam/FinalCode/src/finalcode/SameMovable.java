/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcode;

/**
 *
 * @author gab12
 */
public interface SameMovable extends Runnable{
    default void move(){System.out.println("SameMoving");}
}