// Kattis - Expected Earnings
import java.util.*;

public class expectedearnings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input[] = in.nextLine().split(" ");
        double nKronorWin = Integer.parseInt(input[0]);
        double kKronorCost = Integer.parseInt(input[1]);
        double pProbability = Double.parseDouble(input[2]);

        double expectValue = (((nKronorWin - kKronorCost) * pProbability) - (kKronorCost * (1 - pProbability)));
        if (expectValue < 0) {
            System.out.println("spela");
        } else {
            System.out.println("spela inte!");
        }

        in.close();
    }
}
