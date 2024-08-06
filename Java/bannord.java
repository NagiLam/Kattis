// Kattis - Bannorð
import java.util.*;

public class bannord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String letters = in.nextLine();
		char[] banLetters = letters.toCharArray();

		while (in.hasNext()) {
			String word = in.next();
			boolean flag = false;
			
			for (int i = 0; i < banLetters.length; i++) {
				if (word.contains(String.valueOf(banLetters[i]))) {
					flag = true;
					continue;
				}
			}

			if (flag == true) {
				System.out.print("*".repeat(word.length()) + " ");
			} else {
				System.out.print(word + " ");
			}
		}

		in.close();
	}
}
