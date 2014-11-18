public class PaperTray
{
   private int paper = 0; 

   public void addPaper(int paper) // setPaper()
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

      // if(paper < 1)
//       {
//          return true;
//       }
//       else
//       {
//          return false;
//       }
       
   }
}