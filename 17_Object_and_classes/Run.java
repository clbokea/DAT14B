public class Run
{
   public static void main(String[] args)
   {      
      PrinterFields printer = new PrinterFields();
      
      printer.isOn = true;
      printer.modelNumber = "HP5454";
      
      System.out.println(printer.isOn);
      System.out.println(printer.modelNumber);
     
     
     
     
     
      
      PrinterFields printer2 = new PrinterFields();
      printer2.isOn = false;
      printer2.modelNumber = "Brother1010";
      
      System.out.println(printer2.isOn);
      System.out.println(printer2.modelNumber);

   }
}