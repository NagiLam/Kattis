// Kattis - Avion
import java.util.*;

public class avion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;

		for (int i = 1; i < 6; i++) {
			String input = in.nextLine();

			if (input.contains("FBI")) {
				System.out.print(i + " ");
				count++;
			}

			if (i == 5 && count == 0) {
				System.out.println("HE GOT AWAY!");
			}
		}

		in.close();
	}
}
