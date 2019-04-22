/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gab12
 */
import java.util.Arrays;


class ArrayTest {
  public static void main(String[] args) {
    
    int[] oneArr = new int[][]{{1,2,3,4},{1,2,3,4}}[0];
    System.out.println(Arrays.toString(oneArr));
    int [] arr = {1,2};
    int [][] arr2 = {{1,2}};
    
    int[][] arrr = new int[10][10];
    System.out.println(arrr[9][9]);
    
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.length());
  }
}