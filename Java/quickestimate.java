// Kattis - Quick Estimates
import java.util.*;

public class quickestimate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numbers = Integer.parseInt(in.nextLine());

		for (int i = 0; i < numbers; i++) {
			String input = in.nextLine();
			System.out.println(input.length());
		}
		
		in.close();
	}
}
