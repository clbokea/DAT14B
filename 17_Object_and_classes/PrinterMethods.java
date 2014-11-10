public class PrinterMethods
{
   // Fields the objects state
   String modelNumber;
   boolean isOn;
   
   // Methods that operate on the data
   
   // 1. metode (slettes ved oprettelse af naeste)
   public void print()
   {
      System.out.println(modelNumber);
      System.out.println("Is on: " + isOn);
   }
   // 2. metode change to print text
   public void print(String text)
   {
      System.out.println(modelNumber);
      if(isOn == true)
      {
         System.out.println(text);
      }
      else
      {
         System.out.println("Not Responding!");
      }
      
   }
}