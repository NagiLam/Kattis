// Kattis - T9 Spelling
import java.util.*;

public class t9spelling {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nCases = Integer.parseInt(in.nextLine());
		HashMap<Character, String> spellMap = new HashMap<>();

		spellMap.put('a', "2");
		spellMap.put('b', "22");
		spellMap.put('c', "222");
		spellMap.put('d', "3");
		spellMap.put('e', "33");
		spellMap.put('f', "333");
		spellMap.put('g', "4");
		spellMap.put('h', "44");
		spellMap.put('i', "444");
		spellMap.put('j', "5");
		spellMap.put('k', "55");
		spellMap.put('l', "555");
		spellMap.put('m', "6");
		spellMap.put('n', "66");
		spellMap.put('o', "666");
		spellMap.put('p', "7");
		spellMap.put('q', "77");
		spellMap.put('r', "777");
		spellMap.put('s', "7777");
		spellMap.put('t', "8");
		spellMap.put('u', "88");
		spellMap.put('v', "888");
		spellMap.put('w', "9");
		spellMap.put('x', "99");
		spellMap.put('y', "999");
		spellMap.put('z', "9999");
		spellMap.put(' ', "0");

		for (int i = 1; i < nCases + 1; i++) {
			String input = in.nextLine();
			System.out.print("Case #" + i + ": ");

			String previousSpell = spellMap.get(input.charAt(0));
			System.out.print(previousSpell);

			for (int j = 1; j < input.length(); j++) {
				String currentSpell = spellMap.get(input.charAt(j));

				if (previousSpell.charAt(previousSpell.length() - 1) == currentSpell.charAt(0)) {
					System.out.print(" ");
				}

				System.out.print(currentSpell);
				previousSpell = currentSpell;
			}

			System.out.println();
		}

		in.close();
	}
}
