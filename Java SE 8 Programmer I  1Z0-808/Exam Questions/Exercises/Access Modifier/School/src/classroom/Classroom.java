/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

/**
 *
 * @author gab12
 */
public class Classroom {
    
    public int roomNumber;
    public String teacherName;
    
    static public int member;
        
    static{
        
        int globalKey = 54321;
        int floor = 3;
        member = 4;
        
    }
    public Classroom(int r, String t) {
    roomNumber = r;
    teacherName = t; 
    } 
}