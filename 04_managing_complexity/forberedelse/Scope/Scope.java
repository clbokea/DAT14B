public class Scope
{
   public static int number2;
       
   public static void main(String[] args)
   {  
      System.out.println(number2);
      number2 = 3;
      getUp();
   }
   public static void getUp()
   {
      number2 = 10;
      System.out.println(number2);
   
   }
}