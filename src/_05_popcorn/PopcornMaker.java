package _05_popcorn;

import javax.swing.JOptionPane;

import _04_harry_potter.HarryRunner;

public class PopcornMaker {
	static String flavor = JOptionPane.showInputDialog("What's your popcorn flavor?");
	static Popcorn p = new Popcorn(flavor);
	public static void main(String[] args) {
		PopcornMaker PopRunner = new PopcornMaker();
	}
}
