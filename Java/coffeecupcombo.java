// Kattis - Coffee Cup Combo
import java.util.*;

public class coffeecupcombo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nLectures = Integer.parseInt(in.nextLine());
		String input = in.nextLine();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1') {
				count++;
				if (i + 1 < input.length() && input.charAt(i + 1) == '0') {
					count++;
					i++;
				}

				if (i + 1 < input.length() && input.charAt(i + 1) == '0') {
					count++;
					i++;
				}
			}
		}

		System.out.println(count);
		in.close();
	}
}
