/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylocaldatetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 *
 * @author gab12
 */
public class MyLocalDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime ldt = LocalDateTime.of(2019, 02, 01, 01, 01); // It takes a date and a time of hh:mm only.
        LocalDateTime.parse("2018-02-01T23:22"); // Parsing a text
    }
}
