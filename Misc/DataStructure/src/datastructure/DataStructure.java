/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Function;

/**
 *
 * @author gab12
 */
public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    
    /*
    Define a method named print(DataStructureIterator iterator). 
    Invoke this method with an instance of the class EvenIterator so that it performs the same function as the method printEven
    */
    
    public int size(){
     return SIZE;   
    }
    
    public int get(int index){
        return arrayOfInts[index];
    }
    
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
   interface a{}
    
    interface DataStructureIterator extends java.util.Iterator<Integer>{ } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }
        
        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
        

    }
    
    public DataStructureIterator getEvenIterator(){
        return new EvenIterator();
    }
    
    public void print(DataStructureIterator iterator) {

        // Print out values of even indices of the array

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(java.util.function.Function<Integer, Boolean> function){
        // Print out values of even indices of the array

        for(int i = 0; i < SIZE; i++){
            if(function.apply(i)){
                System.out.print(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }
    
    
    
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
        
        ds.print(ds.getEvenIterator());
        
        ds.print(new DataStructure.DataStructureIterator() {
                private int nextIndex = 1;
                public boolean hasNext() {
                    return (nextIndex <= ds.size() - 1);
                }
                public Integer next() {
                    int retValue = ds.get(nextIndex);
                    nextIndex += 2;
                    return retValue;
                }
            }
        );
        
        System.out.println("print(Function) with lambda expressions");
        ds.print(index -> {
            if (index % 2 == 0) return Boolean.TRUE;
            return Boolean.FALSE;
        });
        ds.print(index -> {
            if (index % 2 == 0) return Boolean.FALSE;
            return Boolean.TRUE;
        });
    }
}