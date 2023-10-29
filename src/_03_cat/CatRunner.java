package _03_cat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CatRunner implements ActionListener{
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static String name = JOptionPane.showInputDialog("What is your cat's name?");
	static Cat cat = new Cat(name);
	public static void main(String[] args) {
		CatRunner catRunner = new CatRunner();
		catRunner.setup();
	}
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();	
	void setup() {
	frame.setVisible(true);
	panel.setVisible(true);
	frame.add(panel);
    panel.add(button);
    button.setText("Name");
    panel.add(button2);
    button2.setText("Pet");
    panel.add(button3);
    button3.setText("K I L L");
    frame.pack();
    button.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button)) {
		cat.printName();
		}else if(buttonPressed.equals(button2)) {
		cat.meow();
		}else if(buttonPressed.equals(button3)) {
		int input = JOptionPane.showConfirmDialog(null, "Do you want to do this?");
		if(input == 0) {
			int input2 = JOptionPane.showConfirmDialog(null, "Are you sure?");
			if(input2 == 0) {
				String input3 = JOptionPane.showInputDialog("Type YES to confirm.");
				if(input3.equals("YES")) {
					cat.kill();
				}
				}
				}
		
		}
	}

}


