//triangleArea
//trianglePerimeter

public class Ex3_16
{
   public static void main(String[] args)
   {
      int a = 8;
      int b = 8;
      int c = 8;
      double area = triangleArea(a, b, c);
      double perimeter = trianglePerimeter(a, b, c);
      System.out.println("The area is: " + area); 
      System.out.println("The perimeter is: " + perimeter);     
   }
   public static double triangleArea(int a, int b, int c)
   { 
      double area = Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)/16);
      return area;
   }
   public static double trianglePerimeter(int a, int b, int c)
   { 
      double perimeter = a+b+c;
      return perimeter;
   }

  
}