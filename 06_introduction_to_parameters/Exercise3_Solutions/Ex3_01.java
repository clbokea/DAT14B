public class Ex3_01
{
   public static void main(String[] args)
   {
      printEvenNumbers(8);
      printEvenNumbers(20);
            
   }
   public static void printEvenNumbers(int maximum)
   {
      for(int i =2; i<= maximum; i=i+2)
      {
         System.out.print("{" + i + "}\t");
      }
      System.out.println();
   }
  
}