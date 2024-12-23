// Kattis - Above Average
import java.util.*;

public class aboveaverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            int nPeople = in.nextInt();
            int[] grades = new int[nPeople];
            double total = 0.0;
            for (int j = 0; j < nPeople; j++) {
                grades[j] = in.nextInt();
                total += grades[j];
            }
            double average = total / nPeople;
            int countAboveAverage = 0;

            for (int grade : grades) {
                if (grade > average) {
                    countAboveAverage++;
                }
            }

            double percentage = (countAboveAverage * 100.0) / nPeople;
            System.out.printf("%.3f%%\n", percentage);
        }

        in.close();
    }
}
