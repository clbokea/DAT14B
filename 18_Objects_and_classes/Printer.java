public class Printer
{
   // fields
   private boolean isOn;
   private String modelNumber;

   public Printer()
   {
   }
   public Printer(boolean isOn, String modelNumber)
   {
      this.isOn = isOn;
      this.modelNumber = modelNumber;
   }


   // Metoder
   public boolean getIsOn()
   {
      return isOn;
   }
   public void setIsOn(boolean x)
   {
      isOn = x;
   } 
   public String getModelNumber()
   {
      return modelNumber;
   }
   
   
   public String print(String text)
   {
      return text;
   }
   
   public void power()
   {
      if(isOn)
      {
         turnOff();
      }
      else
      {
         turnOn();
      }
   }
   
   private void turnOn()
   {
      isOn = true;
   }
   
   private void turnOff()
   {
      isOn = false;
   }

   
}