public class OfficeMain
{
   public static void main(String[] args)
   {
   
      Printer bw = new Printer("HP2056", true); 
      bw.fillPaper(4);         
      bw.print(6); 
  
   }
}