// Kattis - Number Fun
import java.util.*;

public class numberfun {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nCases = Integer.parseInt(in.nextLine());

		for (int i = 0; i < nCases; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();

			if (a + b == c || a - b == c || b - a == c || a * b == c) {
				System.out.println("Possible");
				continue;
			}

			else if (a / b == c || b / a == c) {
				if (c * b == a || c * a == b) {
					System.out.println("Possible");
				} else {
					System.out.println("Impossible");
				}
				continue;
			}

			else {
				System.out.println("Impossible");
			}
		}

		in.close();
	}
}
