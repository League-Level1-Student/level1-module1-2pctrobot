package _07_duck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SquidDuckrunner implements ActionListener {
	JButton dbutton1 = new JButton();
	JButton dbutton2 = new JButton();
	JButton dbutton3 = new JButton();
	JButton sbutton1 = new JButton();
	JButton sbutton2 = new JButton();
	JButton sbutton3 = new JButton();
	Duck daffy = new Duck("donuts",5);
	Squid calimarie = new Squid("Fanta",23);
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		panel.setVisible(true);
		frame.add(panel);
	    panel.add(dbutton1);
	    dbutton1.setText("Duck's Favorite Food");
	    panel.add(dbutton2);
	    dbutton2.setText("Duck's Friends");
	    panel.add(dbutton3);
	    dbutton3.setText("Quack");
	    frame.pack();
	    panel.add(sbutton1);
	    sbutton1.setText("Squid's Favorite Drink");
	    panel.add(sbutton2);
	    sbutton2.setText("Squid's Foes");
	    panel.add(sbutton3);
	    sbutton3.setText("Bloop");
	    frame.pack();
	    dbutton1.addActionListener(this);
	    dbutton2.addActionListener(this);
	    dbutton3.addActionListener(this);
	    sbutton1.addActionListener(this);
	    sbutton2.addActionListener(this);
	    sbutton3.addActionListener(this);
   }
	public static void main(String[] args) {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(dbutton1)) {
			daffy.favFood("donuts");
		}else if(buttonPressed.equals(dbutton2)) {
			daffy.numOfFriends(5);
		}else if(buttonPressed.equals(dbutton3)) {
			daffy.quack();
		}else if(buttonPressed.equals(sbutton1)) {
			calimarie.favDrink(null);
		}else if(buttonPressed.equals(sbutton2)) {
			calimarie.numOfFoes(23);
		}else if(buttonPressed.equals(sbutton3)) {
			calimarie.bloop();
		}
	}
	}

