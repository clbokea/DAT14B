public class Battery
{
   private int level;
   
   public void use()
   {
      level--;
   }
   public void charge(int level)
   {
      this.level = level;
   }
   public boolean isEmpty()
   {
      return level == 0;
   }
}