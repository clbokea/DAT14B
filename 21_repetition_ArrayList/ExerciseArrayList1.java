import java.util.*;

public class ExerciseArrayList1
{
   public static void main(String[] args) throws Exception
   {
   
      FileHandling f = new FileHandling(); 
      ArrayList<Integer> lotto = new ArrayList<Integer>();
      Random r = new Random();
      
      for(int i = 0; i < 6;i++)
      {
         int a = r.nextInt(100)+1;

         if(!lotto.contains(a))
         {
            lotto.add(a);   
         }
         else
         {
            i--;
         }  
      }
      
      f.writeToFile(lotto);
     
      ArrayList<Integer> l = f.readFromFile();
      
      for(int i = 0; i < l.size(); i++)
      {
         System.out.print(l.get(i) + " ");
      }
      
      
   }
}