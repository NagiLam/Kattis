// Kattis - Class Field Trip
import java.util.*;

public class classfieldtrip {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String annList = in.nextLine();
		String benList = in.nextLine();
		
		String result = annList + benList;
		char resultArr[] = result.toCharArray();
		Arrays.sort(resultArr);

		System.out.println(resultArr);
		in.close();
	}
}
