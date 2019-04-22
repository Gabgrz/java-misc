/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


import classroom.Classroom;
import static classroom.Classroom.*;


/**
 *
 * @author gab12
 */
public class School {

    School(){}
    School(String s){
        this();
        
    }
    
    Integer i;
    
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    
    
    
    School sc = new School("s");
    School sc2 = new School("s");
    
    System.out.println(Classroom.globalKey);
    Classroom room = new Classroom(101, "“Mrs. Anderson");
    Classroom room2 = new Cassroom();
    
    System.out.println(room.roomNumber);
    System.out.println(room.floor);
    System.out.println(room); // Object references are resolved during runtime. If an object does not existe because
    // of a previous complilation error, an object reference will not fail to complie by itself.
    System.out.println(room2);
    String s = teacherName;
    int t = member;
    System.out.println(member);

    System.out.println(room.teacherName); }
}
