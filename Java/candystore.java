// Kattis - Candy Store
import java.util.*;

public class candystore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nCustomers = in.nextInt();
		int nQuerries = in.nextInt();
		in.nextLine();
		HashMap<String, String> nameMap = new HashMap<String, String>();

		for (int i = 0; i < nCustomers; i++) {
			String name = in.nextLine();
			String[] nameArr = name.split(" ");
			String initialsKey = String.valueOf(nameArr[0].charAt(0)) + String.valueOf(nameArr[1].charAt(0));
			initialsKey = initialsKey.toUpperCase();

			if (!nameMap.containsKey(initialsKey)) {
				nameMap.put(initialsKey, name);
			} else {
				nameMap.put(initialsKey, "ambiguous");
			}
		}

		for (int j = 0; j < nQuerries; j++) {
			String input = in.nextLine();
			if (nameMap.containsKey(input)) {
				System.out.println(nameMap.get(input));
			} else {
				System.out.println("nobody");
			}
		}

		in.close();
	}
}
