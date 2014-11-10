public class Radio
{
   // fields
   public boolean isOn;
   public double frequence;
   public int volume;
   public String color;
   public double[] favorite = new double[10];
   
   // Methods
   public void power()
   {
      if(isOn == false)
      {
         System.out.println("Warming up!");
         isOn = true;
         System.out.println("Radio is on!");
      }
      else
      {
         System.out.println("Shutting down!");
         isOn = false;
         System.out.println("Radio Off!");
      }
   }
   public void turnOn()
   {
      System.out.println("Warming up!");
      isOn = true;
      System.out.println("Radio is on!");
      
   }
   public void turnOff()
   {
      System.out.println("Shutting down!");
      isOn = false;
      System.out.println("Radio is off!");
   }
   public void volume(int v)
   {
      volume = v;
      System.out.println("Volume: " + volume);
   }
   public void frequence(double f)
   {
      frequence = f;
      System.out.println("Frequence: " + frequence);
   }

}