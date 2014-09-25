//quadratic

public class Ex3_08 
{
   public static void main(String[] args)
   {
      quadratic(1, 4, 1);         
   }
   public static void quadratic(int a, int b, int c)
   {
      System.out.println(a+b+c);
      //System.out.println("x = " + (int)(-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
      //System.out.println("x = " + (int)(-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
   }     
}