package numberprograms;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random random = new Random();

		// Generate a random integer
		int onedigitrandomNumber = random.nextInt(10);

		int twodigitrandomNumber = random.nextInt(100);

		int threedigitrandomNumber = random.nextInt(1000);

		System.out.println("One Digit Random Number: " + onedigitrandomNumber);
		System.out.println("Two Digit Random Number: " + twodigitrandomNumber);
		System.out.println("Three Digit Random Number: " + threedigitrandomNumber);
	}
}
