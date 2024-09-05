// Kattis - Moderate Pace
import java.util.*;

public class moderatepace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nDays = Integer.parseInt(in.nextLine());
		String[] youDistance = in.nextLine().split(" ");
		String[] stColleaDistance = in.nextLine().split(" ");
		String[] ndColleaDistance = in.nextLine().split(" ");

		for (int i = 0; i < nDays; i++) {
			List<Integer> sortDistance = new ArrayList<Integer>();
			sortDistance.add(Integer.parseInt(youDistance[i]));
			sortDistance.add(Integer.parseInt(stColleaDistance[i]));
			sortDistance.add(Integer.parseInt(ndColleaDistance[i]));
			Collections.sort(sortDistance);

			System.out.print(sortDistance.get(1) + " ");
		}

		in.close();
	}
}
