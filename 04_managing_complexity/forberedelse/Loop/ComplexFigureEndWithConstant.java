public class ComplexFigureEndWithConstant
{
   public static final int HEIGHT = 4;
   
   public static void main(String[] args)
   {      
      // linier i figur
      for(int line = 1; line <= HEIGHT;line++)
      {
         // spaces in figure
         for(int i = 1;i<= (-1*line + (1*HEIGHT));i++)
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