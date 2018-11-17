package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewNames = new JButton("View Names");
	
	String user;
	String namelist;
	int guestcount = 1;
	
	ArrayList names = new ArrayList();
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public static void main(String[] args) {
		_02_GuestBook guestbook = new _02_GuestBook();
		guestbook.createGUI();
	}
	
	void createGUI(){
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(addName)) {
			System.out.println("addName Pressed");
			user = JOptionPane.showInputDialog("Enter a name: ");
			names.add(user);
			System.out.println("Names ArrayList: " + names);
					}
		if (e.getSource().equals(viewNames)) {
			System.out.println("View Names");
			for (int i = 0; i < names.size(); i++) {			
				namelist = namelist + "\n Guest #" + guestcount + ": " + names.get(i);
				guestcount++;	
			}
			JOptionPane.showMessageDialog(null, namelist);
		}
		
	}
	
	
	
}
