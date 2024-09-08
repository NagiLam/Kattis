// Kattis - Basketball One-on-One
import java.util.*;

public class basketballoneonone {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int aCount = 0;
		int bCount = 0;

		for (int i = 0; i < input.length() - 1; i++) {
			String nextIndex = String.valueOf(input.charAt(i + 1));

			if (input.charAt(i) == 'A') {
				aCount += Integer.parseInt(nextIndex);
			}

			else if (input.charAt(i) == 'B') {
				bCount += Integer.parseInt(nextIndex);
			}
		}

		if (aCount > bCount) {
			System.out.println("A");
		}

		else if (bCount > aCount) {
			System.out.println("B");
		}

		in.close();
	}
}
