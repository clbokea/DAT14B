public class Radio
{
   // fields
   private boolean isOn;
   private double frequence;
   private int volume;
   private String color;
   public double[] favorite = new double[100];
   
   // Costructors
   public Radio()
   {
      System.out.println("Du har ikke sat noget!!!");
   }
   public Radio(boolean isOn, double frequence)
   {
      this.isOn = isOn;
      this.frequence = frequence;
      
      this.volume = 200;
      this.color = "Blue";

   }
   public Radio(boolean isOn, double frequence, int volume, String color)
   {
      this.isOn = isOn;
      this.frequence = frequence;

   }
   
   // Methods
   // pre: isOn skal have en værdi
   public boolean getIsOn()
   {
      if(isOn == true || isOn == false)
      {
         return isOn;
      }
      
      return false;
      
   }
   public void setIsOn(boolean x)
   {
      isOn = x;
   }
   public double getFrequence()
   {
      return frequence ;
   }
   public void setIsOn(double x)
   {
      frequence = x;
   }

   public void power()
   {
      if(isOn == false)
      {
         turnOn();      
      }
      else
      {
         turnOff();
      }
   }
   private void turnOn()
   {
      System.out.println("Warming up!");
      isOn = true;
      System.out.println("Radio is on!");
      
   }
   private void turnOff()
   {
      System.out.println("Shutting down!");
      isOn = false;
      System.out.println("Radio is off!");
   }
   public void volume(int v)
   {
      volume = v;
      System.out.println("Volume: " + volume);
      if(volume > 100)
      {
         turnOff();
      }
   }
   public void frequence(double f)
   {
      frequence = f;
      System.out.println("Frequence: " + frequence);
   }
   
   public void addFavorite(double frequency)
   {
      for(int i = 0; i < favorite.length; i++)
      {
         if(favorite[i] == 0)
         {
            favorite[i] = frequency;
            i = 200;
         }
         
      }
 
   }
   public String getFavorites()
   {
      String x = "";
      for(int i = 0; i < favorite.length; i++)
      {
         if(favorite[i] != 0)
         {
            x += ", " + favorite[i];
            
         }
  
      }
      return x;
   }

}