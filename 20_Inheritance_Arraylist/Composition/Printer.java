public class Printer extends Machine
{
   // ******** Fields *************
   private String modelNumber;
   private PaperTray paperTray = new PaperTray();
   // ******** Constructors *************
   public Printer(String modelNumber, boolean isOn)
   {
      super(isOn);
      this.modelNumber = modelNumber;
      
   }
   // ******** Methods ******************** 
   public void turnOn()
   {
      System.out.println("Warming Up");
      super.turnOn();
      
   }
   public void turnOff()
   {

   }

   public void print(int copies)
   {  
      if(!isOn)
      { 
         turnOn();
      }
      
      while(copies > 0 && !paperTray.isEmpty()) 
      {
         System.out.println(modelNumber);
         copies--;
         paperTray.usePaper();
      }
      
      if(paperTray.isEmpty())
      {
         System.out.println("Load more Paper!");
      }

   }
   
   // Load paper
   public void fillPaper(int paper)
   {
      paperTray.addPaper(paper);
   }

}