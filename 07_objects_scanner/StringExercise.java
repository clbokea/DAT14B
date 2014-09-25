public class StringExercise
{
   public static void main(String[] args)
   {
     String phrase = "Now you see it, now you don't, NOT, NOT, NOT";
     
     // Print out the phrase in 2 seperate println statements 
     // So it is splitted into 
     // 1. "Now you see it,"
     // 2. " now you don't"
     // Use the table in the book p. 194 (162, 2.edition)
     // HINT: you will be using more than one of the methods from p. 194
     
//      String sub1 = phrase.substring(0, 15);
//      System.out.println(sub1);
//      
//      String sub2 = phrase.substring(16, 29);
//      System.out.println(sub2);
//      
//      System.out.println(sub1 + "\n" + sub2);

     int pos = phrase.indexOf(",");
     String sub1 = phrase.substring(0, pos);
     String sub2 = phrase.substring(pos+1, phrase.length());
     System.out.println(sub1);
     System.out.println(sub2);
     
     String newString  = phrase.replace(',', 'P');
     System.out.println(newString);
     
   }
}