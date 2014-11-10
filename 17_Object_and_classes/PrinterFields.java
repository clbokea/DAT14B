public class PrinterFields
{
   // fields
   public boolean isOn;
   public String modelNumber;

   // Metoder
   public void print(String text)
   {
      System.out.println(text);
   }
   
   public void turnOn()
   {
      isOn = true;
   }
   
}