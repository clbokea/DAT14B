//salary

public class Ex3_13
{
   public static void main(String[] args)
   {
      double salary = salary(5000, 10000);
      System.out.println(salary);      
   }
   public static double salary(int fixedSalary, int grossSales)
   { 
      double salary = fixedSalary + 0.05 * grossSales;
      return salary;
   }
  
}