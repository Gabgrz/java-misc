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
public interface Fighter {
    int power = 1;
    default int punch(int dmg){
        return dmg * power;
    }
}