// Kattis - Help a PhD candidate out!
import java.util.*;

public class helpaphd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nTestcases = Integer.parseInt(in.nextLine());

		for (int i = 0; i < nTestcases; i++) {
			String input = in.nextLine();
			if (input.equals("P=NP")) {
				System.out.println("skipped");
			} else {
				String addArr[] = input.split("\\+");
				System.out.println(Integer.parseInt(addArr[0]) + Integer.parseInt(addArr[1]));
			}
		}

		in.close();
	}
}
