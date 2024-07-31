// Kattis - Sum Squared Digits Function
import java.util.Scanner;

public class sumsquareddigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nDataSets = Integer.parseInt(in.nextLine());

		for (int i = 0; i < nDataSets; i++) {
			int caseNum = in.nextInt();
			int base = in.nextInt();
			int num = in.nextInt();

			int sum = 0;
			while (num > 0) {
				int digit = (num % base);
				sum += digit * digit;
				num = (num - digit) / base;
			}

			System.out.println(caseNum + " " + sum);
		}
		in.close();
	}
}
