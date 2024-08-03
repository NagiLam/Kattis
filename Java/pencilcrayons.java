// Kattis - Pencil Crayons
import java.util.*;

public class pencilcrayons {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nBoxes = in.nextInt();
		int nColors = in.nextInt();
		in.nextLine();

		int count = 0;
		for (int i = 0; i < nBoxes; i++) {
			HashSet<String> colorsSet = new HashSet<String>();
			for (int j = 0; j < nColors; j++) {
				String input = in.next();
				if (!colorsSet.add(input)) {
					count++;
				}
			}
		}

		System.out.println(count);
		in.close();
	}
}
