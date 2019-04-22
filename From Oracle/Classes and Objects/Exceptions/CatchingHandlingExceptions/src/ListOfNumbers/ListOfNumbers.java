/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListOfNumbers;

/**
 *
 * @author gab12
 */
// Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.zip.*;


public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
	// The FileWriter constructor throws IOException, which must be caught.
            PrintWriter out = null;
        try {
            System.out.println("Entered try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
            out.close();
        
    }
    
        public void writeList2() {
           
        // EXAMPLE of a catch handling two types of exceptions.
            
	// The FileWriter constructor throws IOException, which must be caught.
            PrintWriter out = null;
        try {
            System.out.println("Entered try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            
            Handler handler = new FileHandler("OutFile.log");
            Logger.getLogger("").addHandler(handler);

            for (int i = 0; i < 11; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
            

        }
        // In this case, variable ex is declared FINAL
        catch(IndexOutOfBoundsException|IOException ex){
            System.err.println("An exception occur: " + ex.getMessage());
            StackTraceElement elements[] = ex.getStackTrace();
            for(int i = 0, len = elements.length; i < len; i++){
                System.err.println(elements[i].getFileName()
                + ":"+elements[i].getLineNumber()
                + ">> "
                + elements[i].getMethodName()+"()");
            }
            
            Logger logger = Logger.getLogger("ListOfNumbers");
            StackTraceElement elements2[] = ex.getStackTrace();
            for (int i = 0, n = elements2.length; i < n; i++) {
                logger.log(Level.WARNING, elements[i].getMethodName());
            }
            
//            
      
        } 
        finally{
            if(out != null){
                System.out.println("Closing file");
                out.close();
            }
            else{
                System.out.println("File was not open due to exception error");
            }
        }
    }
        
     static String readFirstLineFromFile(String path) throws IOException{
         try(BufferedReader br = new BufferedReader(new FileReader(path))){
             return br.readLine();
            }
         
         // If an exception is thrown by both the try-with-resources statement and the try block,
        // the method will throw the exception from the try block and the try-with-resources exception is suppressed.
  
    }
     
     static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException{
         BufferedReader br = new BufferedReader(new FileReader(path));
         try{
             return br.readLine();
         }
         finally{
             if(br != null) br.close();}
         
         // If both br.readLine(); and br.close(); throw an exception, this method will throw the exception from the finally block.
         // The exception thrown by the try block will be suppressed.
         
     }
     
     public static void writeToFileFromZipFileContents(String zipFileName, String outputFileName) throws IOException{
         Charset charset = StandardCharsets.US_ASCII;
         Path outputFilePath = Paths.get(outputFileName);
         
         try(
                 ZipFile zf = new ZipFile(zipFileName);
                 BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)){
             // Enumerate each entry
             for (java.util.Enumeration entries = zf.entries(); entries.hasMoreElements();){
                 // This is the sequence that the OS uses to separate lines in text files.
                 String newLine = System.getProperty("line.separator");
                 // System.out.println("New Line is: "+newLine);
                 // An explicit casting is used because for the compiler "entries" is of type Interface Enumeration.
                 // The method "getName()" cannot be used as it belongs to the ZipEntry Class.
                 // Casting is allowed because of generics.
                 String zipEntryName = ((ZipEntry)entries.nextElement()).getName() + newLine;
                 writer.write(zipEntryName, 0, zipEntryName.length());
             }
         }
         
     }
     
     public static void viewTable(Connection con) throws SQLException {

    String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

    try (Statement stmt = con.createStatement()) {
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String coffeeName = rs.getString("COF_NAME");
            int supplierID = rs.getInt("SUP_ID");
            float price = rs.getFloat("PRICE");
            int sales = rs.getInt("SALES");
            int total = rs.getInt("TOTAL");

            System.out.println(coffeeName + ", " + supplierID + ", " + 
                               price + ", " + sales + ", " + total);
        }
    } catch (SQLException e) {
       // This is a Class from an Oracle Tutorial: JDBCTutorialUtilities.printSQLException(e);
        
    }
}
     
     public static void cat(File file) {
    
    String line = null;

    try (RandomAccessFile input = new RandomAccessFile(file, "r")){
        // input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        return;
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }

}
    
    public static void main(String[] args){
        
        int[] arrInt = new int[1];
        int arr[] = new int[1];
        
        arr = new int[]{1,2,3,4};
        arrInt[0] = 0;
        System.out.println("ARR IS: "+arrInt[0]);
        
        ListOfNumbers list = new ListOfNumbers();
        list.writeList2();
        try{
            String firstLine = readFirstLineFromFile("OutFile.txt");
            System.out.println(firstLine);
        }
        catch(IOException ie){
            System.out.println("An error occur");
        }
        try{writeToFileFromZipFileContents("DogsZip.zip","OutputDogs.txt");
        }
        catch(IOException ex){
            System.out.println("An error occur");
        }
        
        /*
        try{
        }
        catch (IOException e){
            throw new IOException("Other IOException", e);
            // SampleException Class is missing
       }*/
        
        System.out.println("----------------------------");
        
        System.out.println(args[1]);
        
        // NewClass myClass = new NewClass();
        // myClass.readList("MyText.txt");
        
    }   
}