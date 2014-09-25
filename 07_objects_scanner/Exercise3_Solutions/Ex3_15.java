//squareArea

public class Ex3_15
{
   public static void main(String[] args)
   {
      int area = squareArea(3);
      System.out.println(area);      
   }
   public static int squareArea(int side)
   { 
      double area = Math.pow(side, 2);
      return (int)area;
   }
  
}