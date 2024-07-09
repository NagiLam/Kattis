// Kattis - Rating Problems
import java.util.*;

class ratingproblems {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int totalJudges = in.nextInt();
        int nJudgesRated = in.nextInt();
        in.nextLine();

        double sum = 0.0;
        for (int j = 0; j < nJudgesRated; j++) {
            sum += in.nextInt();
        }

        int remainPointAbs = 3 * (totalJudges - nJudgesRated);
        System.out.print((sum - remainPointAbs) / totalJudges + " "
                + (sum + remainPointAbs) / totalJudges);
        in.close();
    }
}
