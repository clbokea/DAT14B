/*
Finnish this program so you can add the speed of 10 cars passing by 
and calculate the average speed, and get the maximum speed typed in.
Sometimes the person who types in the speed of the cars 
make mistakes and puts in a negative number. 
you should register how many times it happens, 
and if it is more than 10% of the times the result should be canceled.

*/
import java.util.*;
public class ExerciseAvgSpeed
{
   public static void main(String[] args) 
   {
      Scanner console = new Scanner(System.in);
      avgSpeed(console);
   }
   
   public static void avgSpeed(Scanner x)
   {
      int sum = 0;
      int max = 0;
      int negatives = 0;
      
      for(int i = 0; i < 10; i++)
      {
         int temp = x.nextInt();
         
         sum = sum + temp;
         
         if(temp > max)
         {
            max = temp;
         }
         
         if(temp < 0)
         {
            negatives++;
         }
         
         
      }
      if(negatives > 1)
      {
         System.out.println("FAIL");
      }
      else
      {
         System.out.println("Avg speed = " + sum/10);
         System.out.println("Max speed = " + max);
      
      }
      
   }
      
}
