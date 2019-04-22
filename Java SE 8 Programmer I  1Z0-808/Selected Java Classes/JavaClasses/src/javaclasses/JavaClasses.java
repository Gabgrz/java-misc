/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author gab12
 */
public class JavaClasses {
    
    String name;
    
    public JavaClasses(String name){
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof JavaClasses){
            JavaClasses jc = (JavaClasses)obj;
            boolean isEqual = jc.name.equals(this.name);
            System.out.println("Equal or not: "+isEqual);
            return isEqual;
        }
        else 
            return false;
    }
    
        public boolean equals(int i, JavaClasses obj){
        System.out.println("Overloaded method");
        if(obj.name == this.name){
            return true;
        }
        else return false;
    }

    /**
     * @param args the command line arguments
     */
    
    static void iteratePrint(ArrayList<String> list){
        System.out.println("");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        char myChar[] = new char[]{'G','a','b','r','i','e','l'};
        String myName = new String(myChar);
        System.out.println(myName);
        String gab = "Gabriel";
        System.out.println("Is it the same? "+gab.equals(myName));
        System.out.println("Index of :"+gab.indexOf('G', 0));
        
        String spacedStr = "    : HOHO HAHA               HEHE                ";
        System.out.print(spacedStr.trim()+":");
        System.out.println("");
        
        // System.out.print(spacedStr.charAt('a'));
        
        int n = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        String name = "Gab";
        System.out.println(name+n+n2);
        System.out.println(n+n2+name+n3+n4);
        System.out.println(""+n+n2+name+n3+n4);
        System.out.println(n+n2+name+(""+n3+n4));
        
        String null2 = null;
        String null3 = null;
        String h = "Hola";
        System.out.println(null2+""+(h));
        
//        System.out.println(null2.equals(null));
        
        String abc = "ABCDE";
        
        System.out.println("EXC: "+abc.substring(0,2).startsWith("B"));
        
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("Jav");
        String s4 = new String("Jav");
        
        System.out.println(true+""+true);
        System.out.println(s3.equals(s4)+" "+(s3 == s4));
        System.out.println(s1.equals(s2)+" "+(s1 == s2));
        
        StringBuilder ss;
        
        StringBuilder sb = new StringBuilder(0);
        System.out.println(sb.length());
        sb.append("Holaa");
        System.out.println(""+sb+sb.length());
        
        StringBuilder ssb = new StringBuilder("0123456789");
        System.out.println(ssb.delete(0, 4));
        // ssb = 4,5,6,7,8,9
        
        ssb.substring(1,4);
        
        System.out.println("SUBSTRING: "+ssb.substring(1,6).getClass());
        System.out.println("SUBSEQUENCE: "+ssb.subSequence(1,6).getClass());
        
        System.out.println(ssb.reverse());
        
        String mys = "Holaa Ok aa";
        String news = mys.replace("aa", "iiiiiiiiiii");
        System.out.println(news);
        
        // Array declaration, allocation and initialization
        
        // 1. Array declaration
        
        int[] arr[];
        int arr2[];
        int[] arr3;
        int[] arr4[][];
        
        // 2. Array allocation
        
        int[] arr5[] = new int[5][];
        String[] arr6[] = new String[5][4];
        int arr7[] = new int[5];
        
        // 3. Array initialization
        
        char[] abcd = {'a','b','c','d'};
        
        for(int i = 0; i < arr7.length; i++){
            arr7[i] = i;
            System.out.println(arr7[i]);
        }
        
        for(int i = 0; i < arr6.length; i++){
            // System.out.println(arr6[i]);
            for(int x = 0; x < arr6[i].length; x++){
                arr6[i][x] = ""+i+abcd[x];
                System.out.print(arr6[i][x]+" ");
            }
            System.out.println("");
        }
        
        int[][] myi = new int[2][2];
        myi[0][1] = 2;
        
        Integer[][] minte = new Integer[2][2];
        minte[0][1] = 2;
        
        Object[][] myi2 = minte.clone();
        System.out.println("CLONED: "+myi2[0][1]);
        
        // ARRAY LISTS
        
        ArrayList<String> strList = new ArrayList<>();
        // Optional ArrayList<String> strList = new ArrayList<String>();
        
        strList.add("One");
        strList.add("Two");
        strList.add("Four");
        strList.add(2,"Three");
        
        for(int x = 0; x < strList.size(); x++){
            
        }
        
        System.out.println(strList.get(2));
        
        // Iterate with an enhanced For
        
        System.out.println("\nENHANCED FOR:");
        
        for(String str : strList){
            System.out.println(str);
        }
        
        // Iterate with ListIterator
        
        System.out.println("\nLIST ITERATOR:");
        
        ListIterator<String> iterator = strList.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("\nITERATOR:");

        Iterator<String> iterators = strList.iterator();
        while (iterators.hasNext()) {
            System.out.println(iterators.next());
        }
        
        
        // REPLACE AN ELEMENT FROM THE LIST
        
        strList.set(3, "Three and a half");
        iteratePrint(strList);
        
        // MODIFY ELEs of ArrayList
        
        System.out.println("\nITERATE AND MODIFY");
        
        ArrayList<StringBuilder> listsb = new ArrayList<>();
        StringBuilder sb_4 = new StringBuilder("Four");
        
        listsb.add(new StringBuilder("One"));
        listsb.add(new StringBuilder("Two"));
        listsb.add(new StringBuilder("Three"));
        listsb.add(new StringBuilder("Five"));
        
        for(StringBuilder sbg : listsb){
            sbg.append(sbg.length());
            System.out.println(sbg);
        }
        
        System.out.println("\nITERATE AND REMOVE");
        
        listsb.remove(1);
        listsb.remove(sb_4);
        listsb.remove(new StringBuilder("Five"));
        
        for (StringBuilder sss : listsb) {
            sss.append(sss.length());
            System.out.println(sss);
        }
        
        JavaClasses j1 = new JavaClasses("Paul");
        JavaClasses j2 = new JavaClasses("Paul");
        
        System.out.println(j1.equals(1,j2));
        System.out.println(j1 == j2);
        
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("2nd ele"));
        list2.add(new StringBuilder("3rd ele"));
        list2.add(new StringBuilder("4th ele"));
        
        // References are added, no element is removed from the original Array List.
        
        listsb.addAll(1,list2);
        
        System.out.println("Elements added: ");
        
        for(StringBuilder sbbb : listsb){
            System.out.println(sbbb);
        }
        
        // Test to clone an ArrayList to an array.
        
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("Heya");
        myList.add("Hey");
        myList.add("Heyyy");
        myList.add("Hii");
        myList.add("Hello");
        myList.add(new StringBuilder("SB element"));
        
        System.out.println("Original ele: "+myList.get(1));
        
        Object[] clonedList = (Object[])myList.toArray();
        System.out.println("Cloned ele: "+clonedList[1]);
        clonedList[1] = "HeyReplacement";
        System.out.println("Original ele (again): "+myList.get(1));
        System.out.println("Cloned ele (again): "+clonedList[1]);
        System.out.println(((StringBuilder)clonedList[5]));
        System.out.println(((StringBuilder)clonedList[5]).replace(0, 2, "WOW"));
        System.out.println("Cloned ele (again): "+clonedList[5]);
        ((StringBuilder)clonedList[5]).reverse();
        System.out.println("Original ele (again): "+myList.get(5));
        System.out.println(((StringBuilder)clonedList[5])+"\n\n");
        
        BankAccount ba = new BankAccount();
        
        
        StringBuilder mysb = new StringBuilder(4);
        System.out.println(mysb.length());
        mysb.append("HolaAmigo");
        mysb.delete(0, 4);
        System.out.println(mysb);
        mysb.replace(0, 99, "OldFriend");
        System.out.println(mysb.length());
        System.out.println(mysb);
        
        int arg[][] = new int[2][4];
        int[] arg1 = new int[]{1,2};
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList al2 = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        
        al.set(0, 11);
        System.out.println(al.get(1));
        
        Integer intt = 1;
        Integer intt2 = new Integer(1);
        
        String myS = new String("Hola");
        String myS2 = new String("Hola");
        
        System.out.println(intt.equals(intt2));
        System.out.println(intt == intt2);
        
        System.out.println(myS.equals(myS2));
        System.out.println(myS == myS2);
        
        String chained = "Hola".replace("la", "lly Shit!").trim().concat(" Messi GOAT").toUpperCase().concat("           ").trim().concat("!");
        
        // Chained methods are evaluated from left to right and literal won't be assigned to variable untill all are evaluated.
        
        System.out.println(chained);
        
        // THIS
        
        ArrayList<Long> lLong = new ArrayList<>();
        lLong.add(1l);
        lLong.add(2l);
        System.out.println(lLong.get(0).getClass());
        
        
        ArrayList<Integer> lInt = new ArrayList<>(2); // Initial capacity of 2
        // Setting an initial capacity increases performance if it's expected that List will have more elements frequently.
        
        String two = "two";
        String two2 = "LALALELEtwoOKKK";
        
        System.out.println(two2.contains(two)); // String methods that search for equalization, override the equals() method in Object Class.
        // Thus, equals() in String matches the String value, not the String reference.
        
        long[] lArr = new long[]{1,2};
        Long[] lArr2 = new Long[]{1l,2l};
        int[] iArr = new int[]{1,2};
        
        System.out.println(lLong.toString()); // Printing ArrayLists prints an array
        System.out.println(lArr);
        System.out.println(iArr);
        System.out.println(lArr2);
        
        StringBuilder newS = new StringBuilder("MyStringBuilder");
        String subString = newS.substring(0,8); // Substring() in StringBuilder returns a new String
        CharSequence subSeq = newS.subSequence(0,8); // subSequence returns a new CharSequence
        
        System.out.println(newS);
        System.out.println(subString);
        System.out.println(subSeq);
        
        // StringBuilder is inmutable but it has methods that retorn new objects, like subSequence() and substring();
   }
}