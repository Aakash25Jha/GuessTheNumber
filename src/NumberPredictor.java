import java.util.Random;
import java.util.Scanner;

public class NumberPredictor {
	public static void findNumber(int a, int b) {
		int x, y;
		x = a;
		y = b;
		if (y > x) {
			System.out.println("The number is greater than the desired number");
		}

		else if (y < x) {
			System.out.println("The number is smaller than the desired number");
		}
	}

	public static void main(String args[]) {
		int n, m = 0;
		char ch = 'y';
		Scanner sc = new Scanner(System.in);
		System.out.println("Predicted Number Decided");
		// n=sc.nextInt();
		Random r = new Random();

		while (ch == 'y' || ch == 'Y') {
			n = r.nextInt(100);
			while (n != m) {
				System.out.print("Enter your Guess=");
				m = sc.nextInt();
				findNumber(n, m);
			}
			System.out.println("CORRECT GUESS" + " " + n);
			System.out.println("Do you want to continue(y/n)");

			ch = sc.next().charAt(0);

		}
		System.out.println("Bye");
		sc.close();
	}
	
}
