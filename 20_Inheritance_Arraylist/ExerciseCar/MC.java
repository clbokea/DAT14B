public class MC extends Vehicle
{
   // Constructors
   public MC(String brand, String color, int speed)
   {
      super(brand, color, speed);
   }
   public void accellerate(int speed)
   { 
      super.accellerate(speed);     
      System.out.println("The Speed of the MC is now " + speed);
   }
   
   
}