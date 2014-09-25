//scientific

public class Ex3_12 
{
   public static void main(String[] args)
   {
      double sciNo = scientific(-8);
      System.out.println(sciNo);      
   }
   public static double scientific(int number)
   { 
      double sciNo = 10*Math.pow(number, 2);
      return sciNo;
   }
  
}