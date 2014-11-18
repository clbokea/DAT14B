public class Car extends Vehicle
{
   
   // Constructors
   public Car(String brand, String color, int speed)
   {
      super(brand, color, speed);
   } 
   public void accellerate(int speed)
   { 
      super.accellerate(speed);     
      System.out.println("The Speed of the Car is now " + speed);
   }
   
   
  
}