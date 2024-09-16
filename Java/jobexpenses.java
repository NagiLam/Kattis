// Kattis - Job Expenses
import java.util.*;

public class jobexpenses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNum = Integer.parseInt(in.nextLine());
        String[] input = in.nextLine().split(" ");
        int expenses = 0;

        for (int i = 0; i < totalNum; i++) {
            int value = Integer.parseInt(input[i]);
            if (value < 0) {
                expenses += Math.abs(value);
            }
        }

        System.out.println(expenses);
        in.close();
    }
}
