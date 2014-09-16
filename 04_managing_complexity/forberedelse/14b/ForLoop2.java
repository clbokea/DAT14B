public class ForLoop2
{
   public static void main(String[] args)
   {
      // lines
      for(int i = 1; i <= 10; i++)
      {
         System.out.print("Line" + i + ": ");
         
         // numbers
         for(int j = 1; j <= 5; j++)
         {
            System.out.print(j + ", ");
         }
         
         System.out.println();
      }
     
   }
}