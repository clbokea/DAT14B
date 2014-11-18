public class PaperTray
{
   private int paper = 0; 

   public void addPaper(int paper)
   {
      this.paper = paper;
   }
   public void usePaper()
   {
      paper--; 
   }
   public boolean isEmpty()
   {
      return paper == 0;
   }
}