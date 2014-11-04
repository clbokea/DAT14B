import java.util.*;

public class FillArray
{
   public static void main(String[] args)
   { 
      // create array
 
      int[] number = new int[81];
     
      number[0] = 12;
      number[80] = 122;
       
     // fill for loop
     for(int i = 0; i <= number.length; i++)
     {
         System.out.print(number[i]);     
     }
     
     
     
   }
}