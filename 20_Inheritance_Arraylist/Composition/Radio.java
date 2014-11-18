public class Radio extends Machine
{
   // fields
   //private boolean isOn;
   private double frequence;
   private int volume;
   private String color;
   public double[] favorite = new double[100];
   private Battery bat = new Battery();
   
   // Costructors
   public Radio()
   {
      super(true);
   }
   public Radio( double frequence, int volume, String color)
   {
      super(true);
      this.frequence = frequence;
      this.volume = volume;
      this.color = color;
      

   }
   public Radio(boolean isOn, double frequence, int volume, String color)
   {
      super(true);
      this.frequence = frequence;
      
   }
   
   public boolean getIsOn()
   {   
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
   protected void turnOn()
   {
      System.out.println("Warming up!");
      System.out.println("Radio is on!");    
   }
//    private void turnOff()
//    {
//       System.out.println("Shutting down!");
//       isOn = false;
//       System.out.println("Radio is off!");
//    }
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
   
   public void play()
   {
      if(bat.isEmpty())
      {
         System.out.println("Radio is dead! - please recharge");
      }
      else
      {
         System.out.println("Radio is Playing!");
         bat.use();
      }
      
   }
   public void recharge(int level)
   {
      bat.charge(level);
   }

}