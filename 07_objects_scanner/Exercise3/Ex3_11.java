//distance

public class Ex3_11 
{
   public static void main(String[] args)
   {
      double d = distance(3, 5, 7, 2, 4, 6);
      System.out.println(d);      
   }
   public static double distance(int x1, int y1, int z1, 
                               int x2, int y2, int z2)
   { 
      double d = Math.sqrt(Math.pow(x1-x2, 2)
                           +Math.pow(y1-y2, 2)
                           +Math.pow(y1-y2, 2));
      return d;
   }
  
}