import javax.swing.JOptionPane;

public class CakeQuestioning
{
	public static void main(String[] args)
	{
			
      String name = JOptionPane.showInputDialog("What is your name"); 
		int likeCake = JOptionPane.showConfirmDialog(null, "Do you like cake Claus"/* + name*/); 
		
      System.out.println("Your name is: Claus");
      
      if(likeCake == 1)
      {
         JOptionPane.showMessageDialog(null, /*name + */"Claus!! You must be crazy if you don't like cake"); 		   
         System.out.println("And you don«t like cake?");
      }
      else
      {
         JOptionPane.showMessageDialog(null, "Of cause you like cake Claus"/* + name*/);          
         System.out.println("And you like cake :)");
      }
		    
	} 
}