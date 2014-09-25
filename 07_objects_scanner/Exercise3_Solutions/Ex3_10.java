// Area
public class Ex3_10
{
   public static void main(String[] args)
   {
      System.out.print(area(2.0));
   }
 
   public static double area(double radius)
   {
      // Formular for area of sphere: 
      // a = 4 * pi * r^2
      double a = 4 * Math.PI * Math.pow(radius, 2);
      return a;
   }
}