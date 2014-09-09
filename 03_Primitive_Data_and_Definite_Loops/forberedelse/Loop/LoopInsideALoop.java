public class LoopInsideALoop
{
   public static void main(String[] args)
   {
      // print out 4 lines
      // with 10 stars in each line
      
      /*System.out.println("**********");
      System.out.println("**********");
      System.out.println("**********");
      System.out.println("**********");*/
      
      // loop der tager sig af linier
      for(int i =1; i<= 4; i++)
      {
         // loop der udskriver 10 stjerner
         for(int j=1; j <= 10; j++)
         {
            System.out.print("*");
            
         }
         System.out.println();
      }
           
   }
}