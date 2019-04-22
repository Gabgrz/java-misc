/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author gab12
 */
public class Warrior {
    int power = 3;
    public int punch(int dmg) { // method has to be public as Poly inherits a method that's defined in the interface Fighter
        return dmg * power;
    }
}