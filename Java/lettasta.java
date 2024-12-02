// Kattis - Léttasta verkefnið?
import java.util.*;

public class lettasta {
    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nProblems = Integer.parseInt(in.nextLine());
        int nTeams = Integer.parseInt(in.nextLine());
        String[] problemNames = in.nextLine().split(" ");
        int[] totalScore = new int[nProblems];

        for (int i = 0; i < nTeams; i++) {
            String[] input = in.nextLine().split(" ");
            for (int j = 0; j < nProblems; j++) {
                totalScore[j] += Integer.parseInt(input[j]);
            }
        }

        int maxIndex = findMaxIndex(totalScore);
        System.out.println(problemNames[maxIndex]);
        in.close();
    }
}
