package _04_harry_potter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HarryRunner implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static int stun = 0;
	static HarryPotter hp = new HarryPotter();
	public static void main(String[] args) {
		HarryRunner HarryRunner = new HarryRunner();
		HarryRunner.setup();
	}
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();	
	void setup() {
	frame.setVisible(true);
	panel.setVisible(true);
	frame.add(panel);
    panel.add(button);
    button.setText("Cloak");
    panel.add(button2);
    button2.setText("Spy");
    panel.add(button3);
    button3.setText("Spell");
    frame.pack();
    button.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button)) {
			if(hp.cloakOn) {
				hp.makeInvisible(false);
			}else {
				hp.makeInvisible(true);
			}
		}else if(buttonPressed.equals(button2)) {
			if(hp.cloakOn) {
				hp.spyOnSnape();
			}else {
				System.out.println("You can't get close enough while visible.");
			}
		}else if(buttonPressed.equals(button3)) {
			if(hp.cloakOn) {
				System.out.println("You can't cast from under the cloak.");
			}else {
				String spell = JOptionPane.showInputDialog("What would you like to cast?");
				hp.castSpell(spell);
				if(spell.equals("Stupify") && stun == 0) {
					System.out.println("Snape is stunned. You prevented the nefarious things.");
					stun ++;
				}else if(spell.equals("Stupify") && stun >= 0) {
					System.out.println("Snape is stunned...again. You prevented the nefarious things...again.");
				}
			}
		}
	}
}
