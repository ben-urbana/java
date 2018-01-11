import java.util.Scanner;
import java.util.Random;

class Guess {
	public static void main(String[] args) {
		Random radnom = new Random();
		int r = radnom.nextInt(1000) + 1;

		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<7; i++) {
			System.out.println("You have " + (7 - i) + " guesses");
			int x = scanner.nextInt();
			if (x > r) {
				System.out.println("Too High");
			}
			if (x < r) {
				System.out.println("Too Low");
			}
			if (x == r) {
				System.out.println("You Win!");
				System.exit(0);
			}
		}
		System.out.println("The number was " + r);
	}
	
}