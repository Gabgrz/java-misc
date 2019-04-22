/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gw2connection;

import java.sql.*;
import com.mysql.jdbc.exceptions.*;

import java.time.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gab12
 */
public class Gw2Connection {
    
    private static void readObjects(Statement stmt, String sql) throws SQLException{
        Map<Integer, String> map = new HashMap<>();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Object idField = rs.getObject("idRaces");
            Object displayNameField = rs.getObject("display_name");
            if(idField instanceof Integer){
                int id = (Integer) idField;
            }
            if(displayNameField instanceof String){
                String displayName = (String) displayNameField;
            }
            map.put((Integer)idField, (String)displayNameField);
        }
        System.out.println("\nObjects Map: "+map);
    }
    
    private static void readDateTime(Statement stmt, String sql) throws SQLException{
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            java.sql.Date sqlDate = rs.getDate("timestamp_creation");
            LocalDate ld = sqlDate.toLocalDate();
            java.sql.Time sqlTime = rs.getTime("timestamp_creation");
            LocalTime lt = sqlTime.toLocalTime();
            java.sql.Timestamp sqlTimestamp = rs.getTimestamp("timestamp_creation");
            LocalDateTime ldt = sqlTimestamp.toLocalDateTime();
            
            System.out.println("\nLocalDate: "+ld);
            System.out.println("LocalTime: "+lt);
            System.out.println("LocalDateTime" +ldt);
        }
    }
    
    private static void safeDeletion(Connection conn, String race)throws SQLException{
        PreparedStatement ps = conn.prepareStatement("DELETE FROM races WHERE Race_Name = ?");
        ps.setString(1, race);
        ps.execute(); // The JDBC driver takes care of all the escaping for you. This is convenient.
    }
    
    private static void scaryDeletion(Connection conn, String race) throws SQLException{
        Statement stmt = conn.createStatement();
        String sql = "DELETE from races where Race_Name = '"+ race + "'"; // delete from animal where name = 'any' or 1 = 1 or Race_Name='any'
        System.out.println(sql);
        stmt.executeUpdate(sql);
    }
    
    private static void readResultSet(Statement stmt, String sql) throws SQLException{
        Map<Integer, String> idToRaceMap = new HashMap<>();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            int id = rs.getInt("idRaces");
            String raceName = rs.getString("Race_Name");
            idToRaceMap.put(id, raceName);
        }
        System.out.println("Map: "+idToRaceMap);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "GGsql120");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM races"))
        {
            while(rs.next()){
                System.out.println(rs.getString("display_name"));
            }
        }
                
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "GGsql120");   
        System.out.println(conn);
        
        // Creating a Statement after a Connection
        
        Statement stmt = conn.createStatement();
        int int1 = stmt.executeUpdate("use guildwars2;");
        System.out.println("Use DB: "+int1);
        
        // Running executeUpdate()
        try{
            int1 = stmt.executeUpdate("DELETE FROM races");
            int1 = stmt.executeUpdate("insert into races values(1, 'Warrior', 10.0,'"+java.sql.Timestamp.valueOf(LocalDateTime.now()).toString()+"','Hazant');");
            int1 += stmt.executeUpdate("insert into races values(2, 'Thief', 15.0, '"+java.sql.Timestamp.valueOf(LocalDateTime.now()).toString()+"','Robin Hood');");
            int1 += stmt.executeUpdate("insert into races values(3, 'Mesmer', 20.0, '"+java.sql.Timestamp.valueOf(LocalDateTime.now()).toString()+"','GOD');");
            System.out.println("INSERT: " + int1); // Number of rows affected: 2
            int1 = stmt.executeUpdate("update races set Race_Name = 'Thief' where Race_Name = 'Warrior' or Race_Name = 'Mesmer'");
            System.out.println("UPDATE: " + int1); // Number of rows affected: 1
            // stmt.executeUpdate("DELETE from races where Race_Name = 'Thief'");
            // System.out.println("DELETE: " + int1); // Number of rows: 2
            // scaryDeletion(conn,"any'or 1 = 1 or Race_Name ='any");
            // safeDeletion(conn,"any'or 1 = 1 or Race_Name ='any");
            
            // Reading a ResultSet
            readResultSet(stmt,"select idRaces, Race_Name from races");
                        
            // Reading date/time
            readDateTime(stmt, "SELECT * FROM races");
            
            // Reading objects
            readObjects(stmt, "SELECT * FROM races");
        }
        catch(SQLException sqle){System.out.println(sqle.getMessage());}
        // Running executeQuery()
        
        ResultSet rs = stmt.executeQuery("select * from races");
        
        // Running execute()
        
        boolean isQuery = stmt.execute("select * from races");
        // boolean isQuery = stmt.execute("insert into races values (4, 'Engineer', 40.0)");
        
        if(isQuery){
            stmt.getResultSet();
            System.out.println("\nRan a query");
        }
        else {
            stmt.getUpdateCount();
            System.out.println("\nRan an update");
        }
    }
}