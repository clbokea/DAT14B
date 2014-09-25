//PrintReverseGrid

public class Ex3_05 
{
   public static void main(String[] args)
   {
      printReverseGrid(4, 3);
            
   }
   public static void printReverseGrid(int rows, int columns)
   {
      int maxNumberToPrint = rows*columns; 
      // print lines 
      for(int line = rows; line>0; line--)
      { 
         // print one line of columns size        
         for(int i = columns; i>0; i--)
         {
            System.out.print(maxNumberToPrint + "\t");
            maxNumberToPrint = maxNumberToPrint - 1;
         }
         System.out.println();  
      }
   }
   
     
}