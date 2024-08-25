// Kattis - Mylla
import java.util.*;

public class mylla2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] sArray = new String[3];

		for (int i = 0; i < sArray.length; i++) {
			String input = in.nextLine();
			sArray[i] = input;
		}

		char char00 = sArray[0].charAt(0);
		char char01 = sArray[0].charAt(1);
		char char02 = sArray[0].charAt(2);

		char char10 = sArray[1].charAt(0);
		char char11 = sArray[1].charAt(1);
		char char12 = sArray[1].charAt(2);

		char char20 = sArray[2].charAt(0);
		char char21 = sArray[2].charAt(1);
		char char22 = sArray[2].charAt(2);

		if (sArray[0].equals("OOO") || sArray[1].equals("OOO") || sArray[2].equals("OOO")) {
			System.out.println("Jebb");
		}

		else if (char00 == 'O' && char10 == 'O' && char20 == 'O') {
			System.out.println("Jebb");
		}

		else if (char01 == 'O' && char11 == 'O' && char21 == 'O') {
			System.out.println("Jebb");
		}

		else if (char02 == 'O' && char12 == 'O' && char22 == 'O') {
			System.out.println("Jebb");
		}

		else if (char00 == 'O' && char11 == 'O' && char22 == 'O') {
			System.out.println("Jebb");
		}

		else if (char02 == 'O' && char11 == 'O' && char20 == 'O') {
			System.out.println("Jebb");
		}

		else {
			System.out.println("Neibb");
		}
		in.close();
	}
}
