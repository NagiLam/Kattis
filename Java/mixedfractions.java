// Kattis - Mixed Fractions
import java.util.*;

public class mixedfractions {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			int numerator = in.nextInt();
			int denominator = in.nextInt();

			if (numerator == 0 && denominator == 0) {
				break;
			}

			int wholeNum = numerator / denominator;
			int mixFrac = numerator % denominator;
			System.out.println(wholeNum + " " + mixFrac + " / " + denominator);
		}

		in.close();
	}
}
