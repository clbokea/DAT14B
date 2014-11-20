import javax.swing.*;
import java.awt.*;


public class GridLayoutExample
{    
   public static void main(String[] args)
   {
      // Make a JFrame object
      JFrame frame = new JFrame("Title fra object oprttelse");
   
      // Sice of window
      frame.setSize(800, 600);
      frame.setLocationRelativeTo(null);
      frame.setTitle("Title of Window");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLayout(new GridLayout(3,2));
   
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

      // Make it visible
      frame.setVisible(true); 
   
   }
}