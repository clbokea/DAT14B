import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JFrameExample
{    
   public static void main(String[] args)
   {
      // Make a JFrame object
      JFrame frame = new JFrame("Title using constructor");
      // Make it visible
      // frame.setVisible(true); // moved to bottom
      
      // Sice of window
      frame.setSize(new Dimension(800, 600));
      // position of window
      //frame.setLocation(new Point(300, 100));
      frame.setLocationRelativeTo(null);
      // set default close operation
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // title
      //frame.setTitle("Title of Window");
      
      
      // Buttons
      JButton btn1 = new JButton();
      btn1.setText("Hello");
      frame.add(btn1);
        
      JButton btn2 = new JButton();
      btn2.setText("Hanibal");
      frame.add(btn2);
      
      //Text fields
      JTextField field = new JTextField(8);
      frame.add(field);
      
      //Label
      JLabel label = new JLabel();
      label.setText("Hello");
      frame.add(label);
      // Layout
      
      // flowLayout manager
      frame.setLayout(new FlowLayout());

      // set visible
      frame.setVisible(true);

   }
}