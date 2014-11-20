import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample
{    
   public static void main(String[] args)
   {
      // Make a JFrame object
      JFrame frame = new JFrame("Title fra object oprttelse");
   
      // Size of window
      frame.setSize(200, 200);
      frame.setLocationRelativeTo(null);
      frame.setTitle("Title of Window");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLayout(new FlowLayout());
   
      // Buttons
      JButton btn1 = new JButton("1");
      frame.add(btn1);
      
      JButton btn2 = new JButton("2");
      frame.add(btn2);
      
      JButton btn3 = new JButton("3");
      frame.add(btn3);
      
      JButton btn4 = new JButton("4");
      frame.add(btn4);
   
      JButton btn5 = new JButton("5");
   
      frame.add(btn5);
   
      JButton btn6 = new JButton("6");
      frame.add(btn6);
      
      JButton btn7 = new JButton("7");
      frame.add(btn7);
      
      JButton btn8 = new JButton("8");
      frame.add(btn8);

      // Make it visible
      frame.setVisible(true);

   }
}