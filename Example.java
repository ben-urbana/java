import java.util.Scanner;
import java.util.Random;

class Example {
	
	public static void main(String[] args) {
		// for (String str : args) {
		// 	System.out.println(str);
		// }

		// int n = Integer.parseInt(args[0]);
		// double a = Double.parseDouble(args[1]);
		// System.out.println(a + 1.2);

		// Scanner scanner = new Scanner(System.in);

		// System.out.println("Type a number: ");
		// int x = scanner.nextInt();
		// System.out.println("You typed: " + x);

		Random radnom = new Random();

		for (int i=0; i<100; i++){
		int r = radnom.nextInt(10) + 1;

		System.out.println(r);
		}

	}

}