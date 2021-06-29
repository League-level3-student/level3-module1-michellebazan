package _05_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 */
	JPanel panel;
	JFrame frame;
	JButton addEntry;
	JButton searchID;
	JButton viewList;
	// JButton RemoveEntry; -- last

	HashMap<Integer, String> IDList = new HashMap<Integer, String>();

	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();
		log.start();
	}

	public void start() {
		panel = new JPanel();
		frame = new JFrame("ID");

		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		addEntry = new JButton("Add Entry");
		searchID = new JButton("Search By ID");
		viewList = new JButton("View List");

		addEntry.addActionListener(this);
		searchID.addActionListener(this);
		viewList.addActionListener(this);

		panel.add(addEntry);
		panel.add(searchID);
		panel.add(viewList);

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addEntry) {

			String a = JOptionPane.showInputDialog("Enter ID Number");
			int num = Integer.parseInt(a);
			String nam = JOptionPane.showInputDialog("Enter a name");
			IDList.put(num, nam);

		} else if (e.getSource() == searchID) {

			String b = JOptionPane.showInputDialog("Enter ID Number");
			int numb = Integer.parseInt(b);

			if (IDList.containsKey(numb)) {
				System.out.println(IDList.get(numb));
			}

		} else if (e.getSource() == viewList) {
			// prints HashMap
			// for (int i = 0; i < IDList.size(); i++) {
			// System.out.println("ID: " + IDList.get(i) + " Name: " );
			// }
			ArrayList <Integer> keys = new ArrayList <Integer>();
			int index = 0;
			int small = 0;
			int minIndex = 0;
			
				for (Integer i : IDList.keySet()) { 
					keys.add(i);
				}
				
				Collections.sort(keys);
				
				
				for (int i = 0; i < keys.size(); i++) { 
					System.out.println("ID: " + keys.get(i) + " Name: " + IDList.get(keys.get(i)));
				}

		}
	}
}
