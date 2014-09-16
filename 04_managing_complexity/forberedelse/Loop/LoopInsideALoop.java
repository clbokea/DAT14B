public class LoopInsideALoop
{
   public static void main(String[] args)
   {
      // print out 4 lines
      // with 10 stars in each line
      for(int i = 1; i<=7; i++)
      {
         for(int j=1;j<=20; j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
                      
   }
}