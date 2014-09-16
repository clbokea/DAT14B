public class NestedForLoop3
{
   public static void main(String[] args)
   {
   
      //Scope
      
      
      for(int line = 6; line >= 1; line--)
      {
         //stars
         for(int star = 1; star <= line; star++)
         {
             System.out.print("*");
         }
 
         System.out.println();
      }
   }
}