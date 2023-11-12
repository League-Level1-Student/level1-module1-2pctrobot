package _05_popcorn;

import javax.swing.JOptionPane;

import _04_harry_potter.HarryRunner;

public class PopcornMaker {
	static String flavor = JOptionPane.showInputDialog("What's your popcorn flavor?");
	static String time = JOptionPane.showInputDialog("How long do you want to put it in the microwave? (Numbers Please)");
	static int num = Integer.parseInt(time);
	static Popcorn p = new Popcorn(flavor);
	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(p);
		microwave.setTime(num);
		microwave.startMicrowave();
		if(num <= 2) {
			microwave.putInMicrowave(p);
			microwave.setTime(num);
			microwave.startMicrowave();
		}
	}
}