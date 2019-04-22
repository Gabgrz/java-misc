/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendardata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author gab12
 */
public class CalendarData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDate ld = LocalDate.of(2018, Month.OCTOBER, 23);
        LocalDate ld2 = LocalDate.of(2018, 10, 23);
        LocalDate ld3 = LocalDate.of(18, 10, 2);
        LocalDate ed = LocalDate.of(1970,01,06);
        
        System.out.println("NEW DATES:\n"+ld+"\n"+ld2+"\n"+ld3);
        
        String today = "2018-10-23";
        String todayWrong = "2018-09-23";
        
        LocalDate tld = LocalDate.parse(today);
        LocalDate tld2 = LocalDate.parse(todayWrong); // Runtime error if date is passed with a non-double-digit number.
        
        System.out.println("\nPARSED:\n"+tld+"\n"+tld2);
        
        System.out.println("\nGET:\n"+tld.getDayOfMonth());
        System.out.println(tld.getDayOfWeek());
        System.out.println(tld.getDayOfYear());
        System.out.println(tld.getMonth());
        System.out.println(tld.getYear());
        System.out.println(tld.getMonthValue());
        
        System.out.println("\nIS IT:\n"+tld.isAfter(tld2));
        System.out.println(tld.isBefore(tld2));
        
        System.out.println("\nMANIPULATING");
        System.out.println(tld.minusDays(10));
        System.out.println(tld.minusMonths(2));
        System.out.println(tld.minusWeeks(22));
        System.out.println(tld.minusYears(27));
        
        System.out.println("\nREPLACE");
        System.out.println(tld.withDayOfMonth(1));
        System.out.println(tld.withDayOfYear(365));
        
        System.out.println("\nAT TIME");
        System.out.println(tld.atTime(12,24));
        System.out.println(tld.atTime(12,24,59));
        System.out.println(tld.atTime(12,24,59,100));
        System.out.println(tld.atTime(LocalTime.of(23, 10, 59)));
        
        System.out.println("\nTO EPOCH TIME");
        System.out.println(tld.toEpochDay());
        System.out.println(ed.toEpochDay());
        
        // Local times
        
        LocalTime lt = LocalTime.of(1, 05);
        LocalTime lt2 = LocalTime.of(23, 59, 58);
        // Results in Runtime error: LocalTime lt3 = LocalTime.of(1123, 59, 58, 23123);
        // Results in Compile error: LocalTime lt3 = LocalTime.of(1231223123123, 59, 58, 23123);
        
        LocalTime lt3 = LocalTime.of(23, 59, 58, 23123);
        
        System.out.println("\nTO LOCAL TIME");
        System.out.println(lt);
        System.out.println(lt2);
        System.out.println(lt3);
        
        System.out.println("\nMINUS");
        System.out.println(lt.minusMinutes(59));
        System.out.println(lt.minusMinutes(59));
        
        // PERIOD CLASS
        
        System.out.println("\nPERIOD");
        Period p = Period.parse("p5y");
        Period p2 = Period.parse("P5Y");
        Period p3 = Period.parse("P+5y");
        Period p4 = Period.parse("+P5y");   
        Period p5 = Period.parse("-P-5y");
        Period p6 = Period.parse("P-5y");
        Period p7 = Period.parse("-P5y");
        
        Period p8 = Period.ofYears(4);
        Period p9 = Period.of(2, 3, 23);
        
        System.out.println(p);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
        
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate.plus(Period.ofDays(3)));
        System.out.println(myDate.plus(Period.ofYears(3)));
        System.out.println(myDate.plus(Period.ofMonths(3)));
        System.out.println(myDate.plus(Period.ofWeeks(1)));
        
        System.out.println(Period.of(23, 13, 366));
        
        Period np = Period.of(3, 3, -123);
        Period zero = Period.of(0, 0, 0);
        System.out.println(np.isNegative());
        System.out.println(zero.isZero());
        
        System.out.println(Period.of(23, 12, 21).multipliedBy(-4)); // Multi by a negative number always returns negative period bro
        System.out.println(Period.ofDays(2).multipliedBy(14));
        
        DateTimeFormatter dt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter dt1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter dt2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter dt3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.LONG);
        
        System.out.println(myDate.format(dt));
        System.out.println(myDate.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(myDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(myDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
      
        System.out.println(lt.format(DateTimeFormatter.ISO_LOCAL_TIME));
        
        System.out.println(lt.format(DateTimeFormatter.ofPattern("hha ama ssa a")));
        
        
        LocalDate myld = LocalDate.of(2057, 8, 11);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("Y M d");
        System.out.println(myld.format(dtf));
        
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("y-M-d");
        System.out.println(LocalDate.parse("2018-02-1",dtf2));
        
        String a = "ho";
        String b = "ho";
        String c = null+"";
        String d = null;
        String e = "null";
        String f;
        String g = null;
        String h = "null";
        String i = "nu"+"ll";
        String j = "nu"+"ll";
        String k = "n"+"ull";
        
        System.out.println(e.equals(c));
        System.out.println(e.equals(c));
        System.out.println(e.equals(g));
        System.out.println(e == c);
        System.out.println(e == c);
        System.out.println(e == h);
        System.out.println(i == e);
        System.out.println(i+" "+c);
        System.out.println(i == j);
        System.out.println(i + " " + j);
        System.out.println(i == k);
        System.out.println(i + " " + k);
        
        LocalDate lll = LocalDate.of(2018, Month.DECEMBER, 10);
        
        System.out.println(lll.getDayOfWeek());
        System.out.println(lll.getMonth());
        System.out.println(lll.atTime(1, 1, 1));
        System.out.println(lll.toEpochDay());
        
        LocalTime ttt = LocalTime.MAX;
        LocalTime tt2 = LocalTime.parse("23:59:59");
        System.out.println(ttt);
        System.out.println(tt2);
        
        Period pp = Period.parse("p2y2m2d");
        System.out.println(pp);
        System.out.println(Period.parse("p2y2m2w6d"));
        System.out.println(Period.parse("P5w"));
        
        Period one = Period.between(LocalDate.of(2018, Month.MARCH, 28), LocalDate.of(2018, Month.MARCH, 28));
        Period two = Period.between(LocalDate.of(2018, Month.MARCH, 28), LocalDate.of(2018, Month.MARCH, 27));
        Period d32 = Period.parse("p0y0m60d");
        
        System.out.println("ONE "+one);
        System.out.println(one.isZero());
        System.out.println("TWO "+two);
        System.out.println(two.isZero());
        System.out.println(two.isNegative());
        Period three = Period.parse("p-1y2m2d");
        System.out.println(three.isZero());
        System.out.println(three.isNegative());
        
        Period newP = three.minus(two);
        System.out.println(newP);
        
        System.out.println(d32.toTotalMonths());
        
        System.out.println(LocalDate.parse("201808"
                + "23",DateTimeFormatter.BASIC_ISO_DATE));
        
        String sss = LocalDate.parse("2018-12-01").format(DateTimeFormatter.ISO_DATE);
        System.out.println(sss);
        
        String sss2 = LocalDate.parse("2018-12-01").format(DateTimeFormatter.BASIC_ISO_DATE);
        String sss3 = LocalDateTime.parse("2018-12-23T12:13:14").format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(sss2);
        System.out.println(sss3);
        
        // LocalDate does not have to be formatter to be formatted to BASIC_ISO_DATE or ISO_LOCAL_DATE or others, because those static final fields format it.
        // Static final fields in DateTimeFormatter return a String of LocalDate / LocalTime / LocalDateTime formatted.
        // Returns NullPointerException: System.out.println(c.equals(e));

        
        if(true == true){}
            else System.out.println("Hola ELSE");
        
        if(true == true);
            else System.out.println("Hola ELSE");
        
        // if(true==true); is same as if(true==true){}
        
        if(true == true)
            System.out.println("TRUE");
            // System.out.println("TRUE2");
            else System.out.println("Hola ELSE");
        
        if(true == true){
            System.out.println("TRUE");
            System.out.println("TRUE2");}
            else System.out.println("Hola ELSE");
        
        
        boolean tru = false;
        
        if(tru = true)
            for(int ih = 0; ih < 3; ih++){
                System.out.println(ih);
                System.out.println("SPACE");
            }
            
        // Won't compile because if with no braces will not execute more than one single line.
        // Semicolon after if evaluation ends the block
            
    }    
}
