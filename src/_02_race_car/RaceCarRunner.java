package _02_race_car;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner implements ActionListener{
	static JButton button = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static String brand = JOptionPane.showInputDialog("What is your car's brand?");
	static RaceCar car = new RaceCar(brand,5);
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	
	
		// 2. Print the RaceCar's position in the race
	System.out.println("You are number " + car.getPositionInRace() + " in the race.");
		// 3. Crash the RaceCar
	
	
	frame.setVisible(true);
	panel.setVisible(true);
	frame.add(panel);
    panel.add(button);
    button.setText("Info");
    panel.add(button2);
    button2.setText("Overtake");
    panel.add(button3);
    button3.setText("Pitstop");
    frame.pack();
    button.addActionListener(null);
    button2.addActionListener(null);
    button3.addActionListener(null);
    
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button)) {
		System.out.println("You are number " + car.getPositionInRace() + " in the race.");
		}else if(buttonPressed.equals(button2)) {
		car.overtake();
		int rand = new Random().nextInt(10);
		if(rand == 0) {
			car.crash();
		}
		}else if(buttonPressed.equals(button3)) {
		car.pit();
		}
		if(car.getPositionInRace() == 1) {
			frame.setVisible(false);
			panel.setVisible(false);
			JOptionPane.showMessageDialog(null, "Congrats, you've won!");
		}
			
	}
}
