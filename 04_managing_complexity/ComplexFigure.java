public class ComplexFigure
{ 
   public static final int HEIGHT = 30;
   
   public static void main(String[] args)
   {        
      for(int line = 1; line <= HEIGHT; line++)
      {
         for(int space = 1; space <= (LENGTH+HEIGHT); space++)
         {
            System.out.print(" ");
         }
         //stars
         for(int star = 1; star <= (2*line-1); star++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
           
   }
}