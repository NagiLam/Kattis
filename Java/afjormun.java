// Kattis - Afjörmun
import java.util.*;

public class afjormun {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nSentences = Integer.parseInt(in.nextLine());

		for (int i = 0; i < nSentences; i++) {
			String input = in.nextLine().toLowerCase();
			System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1));
		}

		in.close();
	}
}
