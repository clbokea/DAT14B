public class Run
{
   public static void main(String[] args)
   {
            
      Radio r = new Radio(true, 78.8, 100, "RED" );
      r.addFavorite(100.4);
      r.addFavorite(98.4);
      r.addFavorite(66.4);
      
      System.out.println(r.getFavorites()); 
      
      r.volume(200);
      

   }
}