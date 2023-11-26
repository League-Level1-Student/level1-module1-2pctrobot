package _07_duck;

public class Duck {
	private String favoriteFood;
	private int numberOfFriends;
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	void favFood(String favoriteFood) {
		System.out.println("My favorite food is " + favoriteFood + ".");
	}
	void numOfFriends(int numberOfFriends) {
		System.out.println("I have " + numberOfFriends + " friends.");
	}
	void quack() {
		System.out.println("quack");
	}
}
