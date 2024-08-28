// Kattis - Takkar
import java.util.*;

public class takkar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int buttonTrump = Integer.parseInt(in.nextLine());
		int buttonKim = Integer.parseInt(in.nextLine());

		if (buttonTrump > buttonKim) {
			System.out.println("MAGA!");
		}

		else if (buttonKim > buttonTrump) {
			System.out.println("FAKE NEWS!");
		}

		else {
			System.out.println("WORLD WAR 3!");
		}

		in.close();
	}
}
