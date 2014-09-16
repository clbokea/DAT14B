public class Ex1NestedForLoopSolution
{
   public static void main(String[] args)
   {
      // This program prints out 4 lines 
      // with 5 stars on each line
      // System.out.println("*****");
   //       System.out.println("*****");
   //       System.out.println("*****");
   //       System.out.println("*****");
      
      //1. Make a for loop that prints the same 
      
     //  for(int i = 1; i<=4;i++)
//       {
//          System.out.println("*****");
//       }
      
      
      //2. Make a nested for loop that prints the same
      for(int i = 1; i<=4;i++)
      {
         for(int j = 1; j<=5;j++)
         {
            System.out.print("*");
         }
      
         System.out.println();
      }
                                  
   }
}