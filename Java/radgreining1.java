// Kattis - Raðgreining 1
import java.util.*;

public class radgreining1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int sections = in.nextInt();
		boolean flag = true;
		in.nextLine();
		char[] result = "?".repeat(length).toCharArray();

		for (int i = 0; i < sections; i++) {
			int index = in.nextInt() - 1;
			char[] inputChar = in.next().toCharArray();

			for (int j = 0; j < inputChar.length; j++) {
				if (result[index] != '?' && result[index] != inputChar[j]) {
					flag = false;
					continue;
				} else {
					result[index] = inputChar[j];
					index++;
				}
			}
		}

		if (flag) {
			System.out.println(result);
		} else {
			System.out.println("Villa");
		}

		in.close();
	}
}
