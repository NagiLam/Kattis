// Kattis - Hvert Skal Mæta?
import java.util.*;

public class hvertskalmaeta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String rey = "Reykjavik";
		String aku = "Akureyri";

		if (input.equals("Reykjavik")) {
			System.out.println(rey);
		}

		else if (input.equals("Kopavogur")) {
			System.out.println(rey);
		}

		else if (input.equals("Hafnarfjordur")) {
			System.out.println(rey);
		}

		else if (input.equals("Reykjanesbaer")) {
			System.out.println(rey);
		}

		else if (input.equals("Akureyri")) {
			System.out.println(aku);
		}

		else if (input.equals("Gardabaer")) {
			System.out.println(rey);
		}

		else if (input.equals("Mosfellsbaer")) {
			System.out.println(rey);
		}

		else if (input.equals("Arborg")) {
			System.out.println(rey);
		}

		else if (input.equals("Akranes")) {
			System.out.println(rey);
		}

		else if (input.equals("Fjardabyggd")) {
			System.out.println(aku);
		}

		else if (input.equals("Mulathing")) {
			System.out.println(aku);
		}

		else if (input.equals("Seltjarnarnes")) {
			System.out.println(rey);
		}

		in.close();
	}
}
