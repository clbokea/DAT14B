//PrintDecrSquare

public class Ex3_04 
{
   public static void main(String[] args)
   {
      printDecrSquare(8, 4);
            
   }
   public static void printDecrSquare(int maximum, int minimum)
   { 
      // print lines with line number 
      for(int line = maximum; line>=minimum; line--)
      {
         System.out.print(line);
         
         // print numbers from max -1 (7) to min 
         for(int i = line-1; i>=minimum; i--)
         {
            System.out.print(i);
         }
         print numbers from max to linenumber
         for(int j = maximum;j>line;j--)
         {
            System.out.print(j);
         }
         
         System.out.println();
         
      }
   }
  
}