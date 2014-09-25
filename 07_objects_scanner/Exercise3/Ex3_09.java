//sumOfDigits

public class Ex3_09 
{
   public static void main(String[] args)
   {
      int sum = sumOfDigits(99);
      System.out.println("The Sum is: " + sum);         
   }
   public static int sumOfDigits(int number)
   {
      String t = Integer.toString(number);
      int sum = 0;
            
      for(int i = 0; i< t.length();i++)
      {
         char a = t.charAt(i);  
         sum = sum + Character.getNumericValue(a);
      }
       
      return sum;
   }     
}