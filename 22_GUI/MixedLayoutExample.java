import javax.swing.*;
import java.awt.*;

public class MixedLayoutExample
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
      
      frame.setLayout(new BorderLayout());
   
      // Buttons
      JButton btn1 = new JButton("1");
      frame.add(btn1, BorderLayout.NORTH);
      
      JButton btn2 = new JButton("2");
      frame.add(btn2, BorderLayout.WEST);
      
      JButton btn3 = new JButton("3");
      frame.add(btn3, BorderLayout.EAST);
      
      JButton btn4 = new JButton("4");
      frame.add(btn4,BorderLayout.SOUTH);
   
      
      // Create a JPanel and set a LayOut for that panel
      JPanel panel = new JPanel();
      frame.add(panel, BorderLayout.CENTER);
      panel.setLayout(new GridLayout(3,3));
      
      JButton btn5 = new JButton("5");
      panel.add(btn5);
      JButton btn6 = new JButton("6");
      panel.add(btn6);
      JButton btn7 = new JButton("7");
      panel.add(btn7);
      JButton btn8 = new JButton("8");
      panel.add(btn8);
      JButton btn9 = new JButton("9");
      panel.add(btn9);
      JButton btn10 = new JButton("10");
      panel.add(btn10);
      
      
      // Make it visible
      frame.setVisible(true);
            
   }
}