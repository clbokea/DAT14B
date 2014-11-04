public class ArraysAndMethods
{
   public static void main(String[] args)
   {  
      // Create array of int
      int[] number = new int[6]; 
      fillArray(number, 2);
      print(number);
      System.out.println("  Sum = " + sumAnArray(number));

   }
   
   public static void fillArray(int[] x, int y)
   {  
      for(int i = 0; i < x.length; i++)
      {
         x[i] = y*i;     
      }
   }

   // summerer alle tal i array og returnerer summen
   public static int sumAnArray(int[] x)
   {
      int sum = 0;   
      for(int i = 0; i < x.length; i++)
      {
         sum += x[i];     
      }
      return sum;
   }

   
   
 
   public static void print(int[] x)
   {
      for(int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " ");     
      }
   }

   





   
   public static void incrementArray(int[] x)
   {
      for(int i = 0; i < x.length; i++)
      {
         x[i] += 2;     
      }
   }

}