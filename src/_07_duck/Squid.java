package _07_duck;

public class Squid {
	private int numberOfFoes;
	private String favoriteDrink;

	Squid(String favoriteDrink, int numberOfFoes){
		this.favoriteDrink = favoriteDrink;
	    this.numberOfFoes = numberOfFoes;
	}
	void favDrink(String favoriteDrink) {
		System.out.println("My favorite food is " + favoriteDrink + ".");
	}
	void numOfFoes(int numberOfFoes) {
		System.out.println("I have " + numberOfFoes + " foes.");
	}
	void bloop() {
		System.out.println("bloop");
	}
}
