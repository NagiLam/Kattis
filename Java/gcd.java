// Kattis - GCD
import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		while (num1 != num2) {
			if (num1 > num2) {
				num1 -= num2;
			} else {
				num2 -= num1;
			}
		}

		System.out.println(num1);
		in.close();
	}
}
