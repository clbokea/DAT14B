//rectPerimeter

public class Ex3_14
{
   public static void main(String[] args)
   {
      int perimeter = rectPerimeter(3,4);
      System.out.println(perimeter);      
   }
   public static int rectPerimeter(int length, int breadth)
   { 
      int perimeter = 2*(length+breadth);
      return perimeter;
   }
  
}