public class ComplexFigure
{
   public static final int HEIGHT = 40;
   
   public static void main(String[] args)
   {        
     
     for(int line = 1; line<=HEIGHT; line++)
     {
         for(int i=1; i<= -1*line+HEIGHT; i++)
         {
            System.out.print(" ");
         }
         for(int j =1; j<= 2*line-1; j++ )
         {
            System.out.print("*");
         }
         
         System.out.println();
     }
        
   }
}