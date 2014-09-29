public class GradeErrorStart
{
   public static void main(String[] args)
   {
      int score = 65;
      String grade;
      
      if(score >= 90)
      {
         grade = "12";
      }
      if(score >= 80)
      {
         grade = "10";
      }
      if(score >= 70)
      {
         grade = "7";
      }
      if(score >= 60)
      {
         grade = "4";
      }
      if(score >= 50)
      {
         grade = "02";
      }
      if(score < 50)
      {
         grade = "Fail";
      }
      
      System.out.println("You got: " + grade);
      
   }
}