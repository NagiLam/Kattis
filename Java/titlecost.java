// Kattis - Title Cost 
import java.util.*;

public class titlecost {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		int length = input[0].length();
		double capCost = Double.parseDouble(input[1]);

		System.out.println(Math.min(length, capCost));
		in.close();
	}
}
