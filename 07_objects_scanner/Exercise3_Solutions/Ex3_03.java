// PrintPowerOfN
 
public class Ex3_03
{
   public static void main(String[] args)
   {
      printPowerOfN(-2, 8);
            
   }
   public static void printPowerOfN(int number, int n)
   {  
      for(int i = 0; i<=n; i++)
      {
         System.out.print((int)Math.pow(number, i) + " ");
      }
   }
  
}