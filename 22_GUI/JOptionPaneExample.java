import javax.swing.JOptionPane;

public class JOptionPaneExample
{
   public static void main(String[] args)
   { 
      String inputNumber1 = JOptionPane.showInputDialog("Enter first number");
      String inputNumber2 = JOptionPane.showInputDialog("Enter second number");
   
      int num1 = Integer.parseInt(inputNumber1);
      int num2 = Integer.parseInt(inputNumber2);
      int sum = num1 + num2;
      
      int answer = JOptionPane.showConfirmDialog(null, "Do you want to \nsee the result?");
      if(answer == JOptionPane.YES_OPTION)
      {
         JOptionPane.showMessageDialog(null, "The answer is: " + sum, "SUM", JOptionPane.PLAIN_MESSAGE);
      }
  
   }  
}