import java.util.*;

public class EqualityExampleStart
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);

      // equality on primitive datatypes
      
      System.out.print("one or two? ");
      int s = console.nextInt(); 
      
      if(s == 1) 
      {
         System.out.println("You typed " + s);
      }
      else if(s == 2)
      {
         System.out.println("You typed " + s);
      }
      else
      {
         System.out.println("You didn't typed one or two!");
      }

/*
    
    // Equality of object values
      System.out.print("Yes or No? : ");
      String s = console.next(); 
      
      if(s == s) 
      {
         System.out.println("Yes, yes, yes ... i agree too!");
      }
      else
      {
         System.out.println("Ahh, are you shure? .....");
      }
    */
   }
}