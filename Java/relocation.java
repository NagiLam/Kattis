// Kattis - Relocation
import java.util.Scanner;

public class relocation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] companies = new int[num];
		int numQ = in.nextInt();

		for (int i = 0; i < num; i++) {
			companies[i] = in.nextInt();
		}

		for (int i = 0; i < numQ; i++) {
			if (in.nextInt() == 1) {
				companies[in.nextInt() - 1] = in.nextInt();
			} else {
				System.out.println(Math.abs(companies[in.nextInt() - 1] - companies[in.nextInt() - 1]));
			}
		}
	}
}
