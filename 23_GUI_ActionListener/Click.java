import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Click implements ActionListener
{
   // Fields
   JFrame frame = new JFrame("Click Game");
   JButton btnClick = new JButton("Click Me");
   JLabel label = new JLabel("The button was clicked 0 times");
   JButton btnReset = new JButton("Reset");
   private int count = 0;
   
   // Constructor
   public Click()
   {
      frame.setSize(300, 200);
      frame.setLocation(new Point(1, 2));
      //frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLayout(new GridLayout(3,1));
      
      frame.add(btnClick);
      btnClick.addActionListener(this);
      frame.add(label);
      frame.add(btnReset);
      btnReset.addActionListener(this);
      
      frame.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      
      if(e.getSource() == btnClick)
      {
         count++;
      }
      else
      {
         count = 0;
      }
      
      label.setText("The button was clicked " + count + " times");
      
   }
}