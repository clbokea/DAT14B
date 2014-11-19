import java.util.*;

public class ExerciseArrayList1
{
   public static void main(String[] args)
   {
      ArrayList<Integer> lotto = new ArrayList<Integer>();
      
      Random r = new Random();
      
//       for(int i = 0; i < 6;i++)
//       {
//          int a = r.nextInt(10)+1;
// 
//          if(!lotto.contains(a))
//          {
//             lotto.add(a);   
//          }
//          else
//          {
//             i--;
//          }  
//       }
//       
      int j = 0;
      while(j < 6)
      {
         int a = r.nextInt(10)+1;

         if(!lotto.contains(a))
         {
            lotto.add(a);
            j++;   
         }

      }
      
      
      System.out.println(lotto);

   }
}