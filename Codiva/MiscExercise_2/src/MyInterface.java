/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gab12
 */
public interface MyInterface {
	int number = 10;
    default int myMeth(){
      return number;
    }
}