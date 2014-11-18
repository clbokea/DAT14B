import java.util.*;

public class MyArrayLists
{
   public static void main(String[] args)
   {
      // Create
      ArrayList<String> list = new ArrayList<String>();
      
      // Add
      list.add("Claus");
      list.add("Henning");
      list.add("Christian");
      list.add("Arne");
      list.add("Christoffer");
      list.add("Henning");
      list.add("Henning");
      list.add("Marianne");
      
      // Remove
      list.remove(2);
      list.remove("Claus");
      
      // Get
      System.out.println(list.get(4));
      
      // Size
      for(int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
      
      // Set
      list.set(1, "Soren");
      
      for(int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
      
      // clear
      
      // list.clear();
//       
//       for(int i = 0; i < list.size(); i++)
//       {
//          System.out.println(list.get(i));
//       }
      
      // cotains
      System.out.println(list.contains("Henning"));
      
      ArrayList<String> list2 = new ArrayList<String>();
      
      for(String s : list)
      {
         if(!list2.contains(s))
         {
            list2.add(s);
         }
      }
      System.out.println(list);
      System.out.println(list2);
      
      // indexOf
      System.out.println(list.indexOf("Christoffer"));
      
      // lastIndexOf
      System.out.println(list.lastIndexOf("Henning"));
      
      // Sortering
      Collections.sort(list);
      System.out.println(list);

      
      
   }
}