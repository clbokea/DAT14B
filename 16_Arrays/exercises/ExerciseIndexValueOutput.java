public class ExerciseIndexValueOutput
{
   public static void main(String[] args)
   {
   
      int[] number = new int[1000];

      for(int i = 0; i < number.length; i++)
      {
         number[i] = 2*i;
      }
      
      for(int i = 0; i < number.length; i++)
      {
         System.out.println(i + " = " + number[i]);
      }
      
      
      
       // System.out.println("Index\tValue");
      // Lav et array med plads til 1000 tal
      // fyld alle tal fra 2 tabellen i arrayet
      
      
      // System.out.println("0\t" + number[0]);
//       System.out.println("1\t" + number[1]);
//       System.out.println("2\t" + number[2]);
//       System.out.println("3\t" + number[3]);
//       System.out.println("4\t" + number[4]);
//       System.out.println("5\t" + number[5]);
//      
   
     
      // Crate and array and fill it with equal number values, starting at 2
      // (2, 4, 6, 8, 10, 12, etc) 
      // In the console print a table with the header:
      // "Index" & "Value"
      // in the next rows print the index number from the array
      // and the corosponding value  
      
      // It should look something like this:
      
      //      Index     Value     
      //      0         2           
      //      1         4         
      //      2         6        
      //      3         8        
      //      4         10
      //      ...       ... 
  
   }
}