// Kattis - Sticky Keys
import java.util.*;

public class stickykeys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();
		char prev = message.charAt(0);
		String fixedMess = "" + prev;

		for (int i = 1; i < message.length(); i++) {
			char current = message.charAt(i);
			if (prev != current) {
				fixedMess += current;
				prev = current;
			}
		}

		System.out.println(fixedMess);
		in.close();
	}
}
