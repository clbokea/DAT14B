public class ComplexFigureEnd
{
   public static void main(String[] args)
   {      
      // lines in figure
      for(int line = 1; line <= 5;line++)
      {
         // spaces in figure
         for(int i = 1;i<= (-1*line +5);i++)
         {
            System.out.print(" ");
         }
         // * in figure
         for(int j = 1;j<= (2*line -1);j++)
         {
            System.out.print("*");
         }
      
         System.out.println();
      }
      
   }
}