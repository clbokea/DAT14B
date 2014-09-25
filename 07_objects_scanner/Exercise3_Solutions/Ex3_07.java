//smallestAbsVal

public class Ex3_07 
{
   public static void main(String[] args)
   {
      int value = smallestAbsVal(-10, 4, 1);
      System.out.println("The smallest value is: " + value);         
   }
   public static int smallestAbsVal(int first, int second, int third)
   {
      first = Math.abs(first);
      second = Math.abs(second);
      third = Math.abs(third);
      int tempValue = Math.min(first, second);
      int value = Math.min(tempValue, third);
      return value;
   }     
}