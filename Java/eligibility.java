// Kattis -	Eligibility
import java.util.*;

public class eligibility {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nStudents = Integer.parseInt(in.nextLine());
		String[] status = { "eligible", "ineligible", "coach petitions" };

		for (int i = 0; i < nStudents; i++) {
			String[] input = in.nextLine().split(" ");
			int postSecDate = Integer.parseInt(input[1].substring(0, 4));
			int birthYear = Integer.parseInt(input[2].substring(0, 4));
			int nCourses = Integer.parseInt(input[3]);

			if (postSecDate >= 2010) {
				System.out.println(input[0] + " " + status[0]);
			}

			else if (birthYear >= 1991) {
				System.out.println(input[0] + " " + status[0]);
			}

			else if (nCourses >= 41) {
				System.out.println(input[0] + " " + status[1]);
			}

			else {
				System.out.println(input[0] + " " + status[2]);
			}
		}

		in.close();
	}
}
