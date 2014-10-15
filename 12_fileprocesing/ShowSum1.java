import java.io.*;
import java.util.*;

public class ShowSum1 
{
   public static void main(String[] args) throws FileNotFoundException 
   {
      // Program that reads numbers and reports their sum.
      Scanner input = new Scanner(new File("numbers.dat"));
      int i = 1;
      double sum = 0.0;
       
      while(input.hasNextDouble())
      {
         double next = input.nextDouble();
         System.out.println("number " + i + " = " + next);
         sum += next;
         i++;
      }
      System.out.println("Sum = " + sum);
   }
}
