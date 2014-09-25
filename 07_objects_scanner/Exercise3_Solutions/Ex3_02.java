// PrintPowerOf10

public class Ex3_02
{
   public static void main(String[] args)
   {
      printPowerOf10(2);
      System.out.println();
      printPowerOf10(3);
      System.out.println();
      printPowerOf10(4);
            
   }
   public static void printPowerOf10(int minimum)
   {
      
      for(int i = 5; i>=minimum; i--)
      {
         double power = Math.pow(10, i);
         int powerInt = (int)power;
         System.out.print(powerInt + "\t");
      }
   }
  
}