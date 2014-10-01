import java.util.*;
public class MaxMinLoops
{
   public static void main(String[] args) 
   {
      Scanner console = new Scanner(System.in);
      unknownRange(console);
   }
   public static void maxNumber(Scanner x)
   {
      // if you know the range 
      // assign the minimum value to max
      int max = -273;
            
      for(int i = 1; i<=6; i++)
      {
         System.out.print("Temp" + i + "? ");
         int next = x.nextInt();   
         if(next > max)
         {
            max = next;
         }
         
      }
      
      System.out.println("Max number is: " + max);
   }
   public static void unknownRange(Scanner x)
   {
      // if you don´t know the range 
      // assign max with the first value
      // (obtain the first value outside the loop)
      System.out.println("Put in 6 numbers and i will tell you the max");
      System.out.print("Number " + 1 + "? ");
      int max = x.nextInt();
            
      for(int i = 2; i<=6; i++)
      {
         System.out.print("Number " + i + "? ");
         int next = x.nextInt();
            
         if(next > max)
         {
            max = next;
         }

      }
      
      System.out.println("Max number is: " + max);
   }

}
