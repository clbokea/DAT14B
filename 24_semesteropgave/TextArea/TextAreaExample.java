package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextAreaExample implements ActionListener
{
	ArrayList<Person> persons = new ArrayList<Person>();
	JFrame frame = new JFrame();
	JTextArea ta = new JTextArea();

	public TextAreaExample()
	{
		// Create the Frame and set the attributes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Text area test");
		ta.setPreferredSize(new Dimension(500, 450));

		// add 4 persons to the ArrayList
		persons.add(new Person("Claus", "Bové", "København", 44));
		persons.add(new Person("Hanne", "Ipsen", "København", 66));
		persons.add(new Person("Hans", "Thomsen", "Aalborg", 23));
		persons.add(new Person("Tom", "Thimsen", "Køge", 21));

		// Create a TexArea for the Column names (the Haeder)
		JTextArea header = new JTextArea("\tName\tLastname\tCity\tAge");
		header.setPreferredSize(new Dimension(500, 20));
		frame.add(header);

		// Create a string for the data
		String s = persons.get(0).toString();

		// Loop the ArrayList and write it to the String
		for (int i = 1; i < persons.size() - 1; i++)
		{
			s += "\n" + persons.get(i);
		}
		// add the string to the TextArea
		ta.setText(s);
		
		frame.add(ta);

		// tilføj knap som bruges når der skal opdateres
		JButton jb = new JButton("Update");
		jb.addActionListener(this);
		frame.add(jb);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String s = ta.getText();

		Scanner scan = new Scanner(s);

		while (scan.hasNextLine())
		{
			persons.add(new Person(scan.next(), scan.next(), scan.next(), Integer.parseInt(scan.next())));
		}

		// This is just to test the result, it should be deleted
		System.out.println(persons);
	}

}
