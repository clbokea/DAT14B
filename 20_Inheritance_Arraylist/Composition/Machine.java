public class Machine
{
   // ******** Fields *************
   protected boolean isOn;
   
   // ******** Constructors *************
   public Machine(boolean isOn)
   {
      this.isOn = isOn;
   }
   // ******** Methods ******************** 
   public void turnOn()
   {
      isOn = true;
      System.out.println("Machine is on");
   } 
   public void turnOff()
   {
      isOn = false;
      System.out.println("Machine is off");
   }   
}