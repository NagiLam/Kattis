// Kattis - Piece of Cake!
import java.util.*;

public class pieceofcake2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sideLength = in.nextInt();
		int horizontalCut = in.nextInt();
		int horizontalRemain = sideLength - horizontalCut;
		int verticalCut = in.nextInt();
		int verticalRemain = sideLength - verticalCut;

		System.out.println(
				(sideLength - Math.min(horizontalCut, horizontalRemain)) * Math.max(verticalCut, verticalRemain) * 4);
		in.close();
	}
}
