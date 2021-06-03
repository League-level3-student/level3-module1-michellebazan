package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//not done********************************************************************** it doesnt run haha
public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	JFrame frame;
	private JPanel panel;
	private JButton one;
	private JButton two;
	private ArrayList<String> names = new ArrayList <String>();;
	
	
	public static void main() {
		new _02_GuestBook().setup();
	}
	
	public  void setup() {
		frame = new JFrame("HOTEL");
		frame.setVisible(true);
		/*
		panel = new JPanel();
		frame.setSize(500, 500);
		frame.setLocation(60, 60);
		frame.add(panel);
		
		one = new JButton();
		one.setText("Add names");
		two = new JButton();
		two.setText("View Names");
		
		one.addActionListener(this);
		two.addActionListener(this);
		
		panel.add(one);
		panel.add(two);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == one) {
			String a = JOptionPane.showInputDialog(" enter a name");
			names.add(a);
		} else if (e.getSource() == two) {
			JOptionPane.showMessageDialog(panel, names);
		}
	}
}
