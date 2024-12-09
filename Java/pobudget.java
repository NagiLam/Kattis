// Kattis - Programmeringsolympiaden's Budget
import java.util.*;

public class pobudget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nRevenuesExpenses = Integer.parseInt(in.nextLine());
        long moneyCount = 0;

        for (int i = 0; i < nRevenuesExpenses; i++) {
            String name = in.nextLine();
            moneyCount += Long.parseLong(in.nextLine());
        }

        if (moneyCount == 0) {
            System.out.println("Lagom");
        } else if (moneyCount > 0) {
            System.out.println("Usch, vinst");
        } else {
            System.out.println("Nekad");
        }

        in.close();
    }
}
