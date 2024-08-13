// Kattis - Datum
import java.time.LocalDate;
import java.util.*;

public class datum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		int month = in.nextInt();
		LocalDate date = LocalDate.of(2009, month, day);

		String result = date.getDayOfWeek().toString().toLowerCase();
		System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));
		in.close();
	}
}
