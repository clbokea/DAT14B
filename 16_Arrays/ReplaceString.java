import java.util.*;

public class ReplaceString
{
   public static void main(String[] args)
   { 
      String[] name = {"Claus", "Henning", "Anna", "Claus"};
      
      System.out.println(Arrays.toString(name));
      
      for(int i =  0; i < name.length; i++)
      {
         if(name[i].equals("Claus"))
         {
            name[i] = "Tove";
         }
      } 
             
      System.out.println(Arrays.toString(name));  
     
   }
}