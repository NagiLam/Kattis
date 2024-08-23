// Kattis - Shattered Cake
import java.util.*;

public class shatteredcake {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int width = Integer.parseInt(in.nextLine());
		int nPieces = Integer.parseInt(in.nextLine());
		int sum = 0;

		if (nPieces == 0) {
			in.close();
			return;
		}

		for (int i = 0; i < nPieces; i++) {
			int wi = in.nextInt();
			int li = in.nextInt();
			sum += wi * li;
		}

		System.out.println(sum / width);
		in.close();
	}
}
