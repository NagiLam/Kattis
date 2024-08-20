// Kattis - Hitastig
import java.math.BigInteger;
import java.util.*;

public class hitastig {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nReading = Integer.parseInt(in.nextLine());
		String[] tempIn = in.nextLine().split(" ");
		List<BigInteger> tempArr = new ArrayList<>();

		for (int i = 0; i < tempIn.length; i++) {
			tempArr.add(new BigInteger(tempIn[i]));
		}

		System.out.print(Collections.max(tempArr) + " " + Collections.min(tempArr));
		in.close();
	}
}
