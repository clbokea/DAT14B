import java.util.*;
public class Main
{
   public static void main(String[] args)
   {
      ArrayList<Person> list = new ArrayList<Person>(); 
      
      list.add(new Person(1, "Claus", "Bove"));
      list.add(new Person(2, "Ib", "Po"));
      list.add(new Person(3, "Hans", "Ku"));
      list.add(new Person(4, "Tove", "Olesen"));
      list.add(new Person(5, "Ibrahim", "Thomsen"));
      list.add(new Person(6, "Svend", "ydum"));
      
      for(Person p : list)
      {
         System.out.println(p);
         
         
         
         // System.out.print(p.getFName() + " ");
//          System.out.println(p.getLName());
      }
      
   }
}