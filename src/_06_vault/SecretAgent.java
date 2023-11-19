package _06_vault;

import java.util.Iterator;

public class SecretAgent {
	public int findCode(Vault vault) {
		for (int i = 0; i < 1000001; i++) {
			if(vault.tryCode(i) == true) {
				return i;
			}
		}
		return -1;
	}
}
