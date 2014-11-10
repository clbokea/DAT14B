public class OfficeMainMethods
{
   public static void main(String[] args) 
   {
      // Create 2 objects of the printer Class
   
      // The Office's Black/white printer
      PrinterMethods bw = new PrinterMethods();
      bw.isOn = true;
      bw.modelNumber = "HP2056";
      
      // The Office's Color printer
      PrinterMethods color = new PrinterMethods();
      color.isOn = false;
      color.modelNumber = "Brother_i5578";
      

      bw.print();
      bw.print("Hello black & White printer");
      
      color.print();
      color.isOn = true;
      color.print();
      color.print("Color print is nicer!");
      
      color.turnOn();
      
   }
}