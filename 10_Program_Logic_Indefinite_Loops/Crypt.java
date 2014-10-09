public class Crypt
{
   public static void main(String[] args)
   {
      
      String message = "Dette er en tekst";
      String cryptMessage = crypt(message, 3);
      System.out.println(cryptMessage);
      
      String deCryptMessage = deCrypt(cryptMessage, 3);
      System.out.println(deCryptMessage);

   }
   public static String crypt(String message, int key)
   {
      String cryptString = "";
      for(int i = 0; i < message.length(); i++)
      {
         int j = (int)message.charAt(i);
         int crypt = j + key;
         char x = (char)crypt;
         cryptString += x;
      }
      
      return cryptString;

   }
   public static String deCrypt(String cryptMessage, int key)
   {
      String deCryptString = "";
      
      for(int i = 0; i < cryptMessage.length(); i++)
      {
         int j = (int)cryptMessage.charAt(i);
         int deCrypt = j - key;
         char x = (char)deCrypt;
         deCryptString += x;
      }
      
      return deCryptString;

   }
}