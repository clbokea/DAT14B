import java.util.*;
public class MaxMinLoops
{
   public static void main(String[] args) 
   {
      Scanner console = new Scanner(System.in);
      int max = maxNumber(console);
      System.out.println("Max number = " + max);
   }
   public static int maxNumber(Scanner x)
   {
      int max = -276;
      
      for(int i = 1; i <= 6; i++)
      {
         int temp = x.nextInt();

         if(temp < -276)
         {
            System.out.println("NOOOOO");
         }
         else if(temp > max)
         {
            max = temp;
         }
         
        
            
      
      }
      return max;
   }
   
   public static void unknownRange(Scanner x)
   {
      int max = x.nextInt();
      
      for(int i = 1; i <= 6; i++)
      {
         int temp = x.nextInt();
         
         if(temp > max)
         {
            max = temp;
         }
      }
      
     printResult(max);

   }
   public static void printResult(int x)
   {
       System.out.println("Max number = " + x);
   }

}
