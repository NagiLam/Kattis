// Kattis - Divvying Up
import java.util.*;

public class divvyingup {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nContests = in.nextInt();
		int sum = 0;

		for (int i = 0; i < nContests; i++) {
			sum += in.nextInt();
		}

		System.out.println((sum % 3 == 0) ? "yes" : "no");
		in.close();
	}
}
