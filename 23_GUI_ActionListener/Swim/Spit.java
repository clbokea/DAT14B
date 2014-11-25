import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Spit implements ActionListener
{
   //Fields
   JFrame frame = new JFrame("Swim");
   JButton btn1 = new JButton("Click Me");
   JTextArea ta = new JTextArea("Dette er et text area");
   String temp = "";
   
   // Metoder
   public Spit()
   {
      frame.setSize(1600, 200);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLayout(new FlowLayout());
      
      // Componet
      
      frame.add(btn1);
      btn1.addActionListener(this);
      
      frame.add(ta);

      frame.setVisible(true);
      
   }  
   public void actionPerformed(ActionEvent e)
   {

       ArrayList<String> l = new ArrayList<String>();
       l.add("Test");
       l.add("Test 2");
       l.add("Test 3");
       l.add("Test 4");
       
       for(int i = 0; i < l.size(); i++)
       {
         temp += l.get(i) + "\n"; 
       }
       
       ta.setText(temp);
        
          
   }
}