// Kattis - Birthday Memorization
import java.util.*;

public class fodelsedagsmemorisering {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nFriends = Integer.parseInt(in.nextLine());
		HashMap<String, String> nameMap = new HashMap<>();
		HashMap<String, Integer> daysMap = new HashMap<>();

		for (int i = 0; i < nFriends; i++) {
			String[] input = in.nextLine().split(" ");
			String name = input[0];
			int likeValue = Integer.parseInt(input[1]);
			String birthDay = input[2];

			if (!daysMap.containsKey(birthDay) || likeValue > daysMap.get(birthDay)) {
				daysMap.put(birthDay, likeValue);
				nameMap.put(birthDay, name);
			}
		}

		List<String> result = new ArrayList<>(nameMap.values());
		Collections.sort(result);
		System.out.println(result.size());

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		in.close();
	}
}
