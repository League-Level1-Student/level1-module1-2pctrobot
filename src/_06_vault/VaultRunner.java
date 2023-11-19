package _06_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	
	public static void main(String[] args) {
		Vault vault = new Vault();
		SecretAgent agent = new SecretAgent();
		String guess = JOptionPane.showInputDialog("What's your guess?");
		int num = Integer.parseInt(guess);
		vault.tryCode(num);
		if(vault.tryCode(num) == true) {
			System.out.println("CORRECT!");
		}else {
			System.out.println("INCORRECT!");
			System.out.println(agent.findCode(vault));
		}
}
}
