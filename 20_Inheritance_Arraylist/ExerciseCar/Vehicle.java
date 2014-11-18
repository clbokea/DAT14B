public class Vehicle
{
   protected String brand;
   protected String color;
   protected int speed;
   
   public Vehicle(String brand, String color, int speed)
   {
      this.brand = brand;
      this.color = color;
      this.speed = speed;
   }
   public void drive(int speed)
   {
      System.out.println("The " + color + " " + brand + " ");
      System.out.println("Sounds like this: Brrrrrrmmmm!");
      accellerate(speed);  
   }

    public void accellerate(int speed)
   {
      if(speed < this.speed)
      {
         for(int i = this.speed; i > speed; i = i-10)
         {
            System.out.print(i + " ... ");
         }      
      }  
      else
      {
         for(int i = this.speed; i < speed; i = i+10)
         {
            System.out.print(i + " ... ");
         }  
      }
       
      //System.out.println("The Speed of the Vehicle is now " + speed);
      this.speed = speed;
   }
}