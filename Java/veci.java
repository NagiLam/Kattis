// Kattis - Veci
import java.util.*;

public class veci {

	public static int leftNum(ArrayList<Integer> list, int index) {
		int num = list.get(index);
		for (int i = index - 1; i >= 0; i--)
			if (list.get(i) < num)
				return i;

		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.next();
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i < num.length(); i++)
			nums.add(Integer.parseInt(num.substring(i, i + 1)));

		int leftnum = -1;

		for (int i = nums.size() - 1; i > 0; i--) {
			leftnum = leftNum(nums, i);
			if (leftnum != -1) {
				int temp = nums.get(leftnum);
				nums.set(leftnum, nums.get(i));
				nums.set(i, temp);
				break;
			}
		}

		if (leftnum == -1)
			System.out.println(0);
		else {
			ArrayList<Integer> side = new ArrayList<>();
			leftnum += 1;

			for (int i = leftnum; i < nums.size(); i++)
				side.add(nums.get(i));

			Collections.sort(side);
			String result = "";

			for (int i = 0; i < leftnum; i++)
				result += nums.get(i);

			for (int i = 0; i < side.size(); i++)
				result += side.get(i);

			System.out.println(result);
		}

		in.close();
	}
}
