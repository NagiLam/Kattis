// Kattis - Falling Apart
import java.util.*;

public class fallingapart {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nPieces = Integer.parseInt(in.nextLine());
		int aliceInt = 0, bobInt = 0;
		String[] inputString = in.nextLine().split(" ");
		List<Integer> integerList = new ArrayList<>();

		for (String s : inputString) {
			integerList.add(Integer.parseInt(s));
		}

		for (int i = 0; i < nPieces; i++) {
			int number = Collections.max(integerList);
			if (i % 2 == 0) {
				aliceInt += Collections.max(integerList);
				integerList.remove(Integer.valueOf(number));
			} else {
				bobInt += Collections.max(integerList);
				integerList.remove(Integer.valueOf(number));
			}
		}

		System.out.print(aliceInt + " " + bobInt);
		in.close();
	}
}
