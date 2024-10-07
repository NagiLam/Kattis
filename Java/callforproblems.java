// Kattis - Call for Problems
import java.util.*;

public class callforproblems {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nCandidateProblems = Integer.parseInt(in.nextLine());
        int count = 0;

        for (int i = 0; i < nCandidateProblems; i++) {
            int number = in.nextInt();
            if (number % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
