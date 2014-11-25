import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swim implements ActionListener
{
   //Fields
   JFrame frame = new JFrame("Swim");
   JButton btn1 = new JButton("Click Me");
   JButton btn2 = new JButton("Click Me 2");

   
   // Metoder
   public Swim()
   {
      frame.setSize(800, 400);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLayout(new FlowLayout());
      
      // Componet
      
      frame.add(btn1);
      btn1.addActionListener(this);
      
      frame.add(btn2);
      btn2.addActionListener(this);

      frame.setVisible(true);
      
   }  
   public void actionPerformed(ActionEvent e)
   {
         if(e.getSource() == btn1)
         {
            Click c = new Click();
         }else
         {
            
            Spit c = new Spit();
         }
          
   }
}