import java.util.*;
import java.io.*;
public class FileHandling
{
   File f = new File("hello.txt");
   
   public void writeToFile(ArrayList<Integer> x) throws Exception
   {
      
      PrintStream output = new PrintStream(f);
      
      for(int i = 0; i < x.size(); i++)
      {
         output.print(x.get(i) + " ");
      }
      output.print(x);
      
   }
   public ArrayList<Integer> readFromFile() throws Exception
   {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      Scanner s = new Scanner(f);
      
      while(s.hasNextInt())
      {
         // add to arraylist from txt file
         temp.add(s.nextInt());
      }
      
      return temp;
   }
}