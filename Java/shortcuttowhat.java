// Kattis - A Shortcut to What?
import java.util.*;

public class shortcuttowhat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = Integer.parseInt(in.nextLine());
		number = ((number + 5) * 3) - 10;

		System.out.println(number);
		in.close();
	}
}
