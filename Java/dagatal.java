// Kattis - Dagatal
import java.util.*;

public class dagatal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = Integer.parseInt(in.nextLine());

		if (month <= 6 && month != 2) {
			System.out.println((month % 2 == 0) ? "30" : "31");
		}

		else if (month == 2){
			System.out.println("28");
		}

		else if (month == 7 || month == 8) {
			System.out.println("31");
		}

		else {
			System.out.println((month % 2 == 0) ? "31" : "30");
		}

		in.close();
	}
}
