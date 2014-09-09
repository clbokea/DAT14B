public class HumptyDumptyStu
{
   public static void main(String[] args)
   {
      foo1();
   }
   
   public static void foo1()
   {
      foo2();
      foo2();
   }
   
   public static void foo2()
   {
      foo3();
      foo3();
   }
   
   public static void foo3()
   {
      foo4();
      foo4();
      foo4();
   }
   
   public static void foo4()
   {
      System.out.println("Humpty Dumbty had a great FALL");
      System.out.println("Humpty Dumbty had a great FALL");
      System.out.println("Humpty Dumbty had a great FALL");
      System.out.println("Humpty Dumbty had a great FALL");
      System.out.println("Humpty Dumbty had a great FALL");
   }
}

// 60|2
// 30|2
// 15|3
//  5|5
//  1