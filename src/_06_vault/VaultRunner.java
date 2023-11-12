package _06_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		String guess = JOptionPane.showInputDialog("What's your guess?");
		int num = Integer.parseInt(guess);
		vault.tryCode(num);
		System.out.println("The answer was " + guess);
}
}
