// Kattis - The Amazing Human Cannonball
import java.util.*;

public class humancannonball2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nTestCases = Integer.parseInt(in.nextLine());

		for (int i = 0; i < nTestCases; i++) {
			double v0 = in.nextDouble();
			double angle = in.nextDouble() / 180 * Math.PI;
			double x1 = in.nextDouble();
			double hLower = in.nextDouble() + 1;
			double hUpper = in.nextDouble() - 1;

			double t = x1 / (v0 * Math.cos(angle));
			double y_t = v0 * t * Math.sin(angle) - (0.5 * 9.81 * t * t);

			if (y_t >= hLower && y_t <= hUpper) {
				System.out.println("Safe");
			} else {
				System.out.println("Not Safe");
			}
		}

		in.close();
	}
}
