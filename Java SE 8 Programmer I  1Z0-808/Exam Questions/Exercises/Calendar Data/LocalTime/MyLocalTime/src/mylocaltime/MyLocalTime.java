/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylocaltime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
// import java.time.LocalDateTime;
/**
 *
 * @author gab12
 */
public class MyLocalTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. *** INSTANTIATING WITH OF FACTORY METHOD ***
        
        LocalTime lt = LocalTime.of(23, 59, 59, 123252);
        LocalTime lt2 = LocalTime.of(00, 00, 00);
        LocalTime lt3 = LocalTime.of(12, 23);
        // LocalTime lt4 = LocalTime.of(23, 01, 01);
        // Throws a DateTime exception because the hour parameter is invalid.
        
        // *** PARSING TEXT ***
        
        LocalTime lt5 = LocalTime.parse("12:13:14");
        LocalTime lt6 = LocalTime.parse("12:13");
        
        // LocalTime lt7 = LocalTime.parse("12");
        // -> DateTimeParseException is thrown because it's not possible to pass an hour only.
        // LocalTime lt8 = LocalTime.parse("");
        // -> DateTimeParseException thrown as it's not possible to pass an empty string.
        
        // ** CREATING DATES WITH PREDEFINED TIMES ***
        
        LocalTime lt9 = LocalTime.MIN;
        LocalTime lt7 = LocalTime.MAX;
        LocalTime lt8 = LocalTime.MIDNIGHT;
        LocalTime lt10 = LocalTime.NOON;
        
        
        // ------------------- INSTANCE METHODS -------------------
        
        // *** QUERING LOCAL TIME ***
        
        lt.getHour();
        
        // *** COMPARING TIMES ***
        
        lt.isAfter(lt2);
        lt.isBefore(lt2);
        
        // *** MANIPULATING LocalTime ***
        
        lt.plusHours(1l); // Adding one hour as long primitive.
        
        // *** COMBINING LocalTime object with a LocalDate object to create a LocalDateTime object.
        
        lt.atDate(LocalDate.of(12, Month.MARCH, 1));
        LocalDateTime ldt = lt.atDate(LocalDate.of(2017, Month.MARCH, 1));
        System.out.println(lt);
        System.out.println(ldt);
        

        
        
    }
}


