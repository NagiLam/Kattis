// Kattis - Cypher Decypher
import java.util.*;

public class cypherdecypher {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String multiplier = in.nextLine();
		int nCases = Integer.parseInt(in.nextLine());
		Map<Character, Integer> mapping = new HashMap<>();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			mapping.put(ch, ch - 'A');
		}

		for (int i = 0; i < nCases; i++) {
			String plainText = in.nextLine();
			String result = "";
			for (int j = 0; j < plainText.length(); j++) {
				int multiValue = Integer.parseInt(String.valueOf(multiplier.charAt(j)));
				int encodeValue = (mapping.get(plainText.charAt(j)) * multiValue) % 26;
				Character key = mapping.entrySet()
						.stream()
						.filter(entry -> entry.getValue().equals(encodeValue))
						.map(Map.Entry::getKey)
						.findFirst()
						.orElse(null);
				result += key;
			}

			System.out.println(result);
		}
		in.close();
	}
}
