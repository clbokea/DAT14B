public class NestedForLoop1
{
   public static void main(String[] args)
   {
      // lines
      for(int line = 1; line <= 6; line++)
      {  
         // stars
         for(int j = 1; j <= line; j++)
         {
            System.out.print("*");
         }
         
         System.out.println();
      }
     
   }
}