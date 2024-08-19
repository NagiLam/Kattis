// Kattis - Rectangle Area
import java.util.*;

public class rectanglearea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		System.out.println(Math.abs((x2 - x1) * (y2 - y1)));
		in.close();
	}
}
