package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Chrk implements ActionListener {
	// Fields, a new object of JFrame, JTable And an ArrayList of persons
	JFrame frame = new JFrame();
	JTable table = new JTable();
	ArrayList<Person> persons = new ArrayList<Person>();
	// Create an Object of DefaultTableModel
	DefaultTableModel model = new DefaultTableModel();

	public Chrk() {
		// Create the Frame and set the attributes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 800);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Text area test");

		// add 4 persons to the ArrayList
		persons.add(new Person("Claus", "Bové", "København", 44));
		persons.add(new Person("Hanne", "Ipsen", "København", 66));
		persons.add(new Person("Hans", "Thomsen", "Aalborg", 23));
		persons.add(new Person("Tom", "Thimsen", "Køge", 21));

		// call the method updateJTable()
		updateJTable();
		// add scrollpane to table
		JScrollPane scrollPane = new JScrollPane(table);

		frame.add(scrollPane);

		// tilføj knap som bruges når der skal opdateres
		JButton jb = new JButton("Update");
		jb.addActionListener(this);
		frame.add(jb);

		frame.setVisible(true);
	}

	private void updateJTable() {
		// add the column names
		model.setColumnIdentifiers(new String[] { "Name", "Lastname", "City", "Age" });

		// set how many rows will be in the table
		model.setRowCount(persons.size());

		// create a counter for counting what row we are in
		int row = 0;

		// Foreach loop to loop through the ArrayList. One row (person) at a
		// time
		for (Person p : persons) {
			// add each cell in the table
			model.setValueAt(p.getName(), row, 0);
			model.setValueAt(p.getLastName(), row, 1);
			model.setValueAt(p.getCity(), row, 2);
			model.setValueAt(p.getAge(), row, 3);
			// increment row number
			row++;
		}
		// add the DefaultTableModel to the JTable
		table.setModel(model);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Clear the ArrayList, so it is ready to get new content
		persons.clear();

		// loop the amount of times = to the rows in the JTable
		for (int i = 0; i < model.getRowCount(); i++) {
			// add a new person to the ArrayList -- model.getValueAt -- i = to
			// row, 0 1 2 3 the columns
			persons.add(new Person(model.getValueAt(i, 0).toString(), 
					model.getValueAt(i, 1).toString(), 
					model.getValueAt(i, 2).toString(), 
					(Integer) model.getValueAt(i, 3)));
		}

		// This is just to test the result, it should be deleted
		System.out.println(persons);

	}

}
