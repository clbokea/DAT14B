//smallerAbsVal

public class Ex3_06 
{
   public static void main(String[] args)
   {
      int value = smallerAbsVal(-10, 4);
      System.out.println("The smalest value is: " + value);         
   }
   public static int smallerAbsVal(int first, int second)
   {
      first = Math.abs(first);
      second = Math.abs(second);
      int value = Math.min(first, second);
      return value;
   }     
}