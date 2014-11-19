public class Person
{
   private int id;
   private String fName;
   private String lName;
   
   public Person(int id, String fName, String lName)
   {
      this.id = id;
      this.fName = fName;
      this.lName = lName;    
   }
   public int getId()
   {
      return id;
   }
   public String getFName()
   {
      return fName;
   }
   public String getLName()
   {
      return lName;
   }
   
   public String toString()
   {
      return "[" + id + " " + fName + " " + lName + " " + "]";
   }
   
   
}