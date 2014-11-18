public class RaceTrack
{
   public static void main(String[] args)
   {
      Car bmw = new Car("BMW", "RED", 100); // kalder constructor
      bmw.drive(50);

      bmw.accellerate(61);
      bmw.accellerate(27);
      
      MC suzuki = new MC("Suzuki", "Yellow", 280);
      suzuki.drive(100);
      
      suzuki.accellerate(61);
      suzuki.accellerate(27);
      


      
   }
}