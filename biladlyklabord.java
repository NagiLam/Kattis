// Kattis - Bilað Lyklaborð
import java.util.*;

public class biladlyklabord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		StringBuilder sb = new StringBuilder();

		if (input.length() > 0) {
			char prev = input.charAt(0);
			sb.append(prev);
			for (int i = 1; i < input.length(); i++) {
				char cur = input.charAt(i);
				if (cur != prev) {
					sb.append(cur);
					prev = cur;
				}
			}
		}

		System.out.println(sb);
		in.close();
	}
}
