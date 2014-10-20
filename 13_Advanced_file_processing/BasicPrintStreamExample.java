import java.io.*;
import java.util.*;
public class BasicPrintStreamExample
{
   public static void main(String[] args) throws FileNotFoundException
   { 
      // Create a PrintStream Object  
      PrintStream output = new PrintStream(new File("hello.txt"));
           
      // Write to the file
      String x = "Hello";
      output.print(x);
      output.print("A B C D E");
      output.println("Dette er en ny linie");
           
   }
}
