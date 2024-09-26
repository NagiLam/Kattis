// Kattis - 
import java.util.*;

public class electionparadox {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nRegions = Integer.parseInt(in.nextLine());
        int[] regionsArr = new int[nRegions];

        for (int i = 0; i < nRegions; i++) {
            regionsArr[i] = in.nextInt();
        }

        Arrays.sort(regionsArr, 0, nRegions);
        int maxVote = 0;
        for (int i = 0; i < nRegions; i++) {
            if (i <= nRegions / 2) {
                maxVote += regionsArr[i] / 2;
            } else {
                maxVote += regionsArr[i];
            }
        }

        System.out.println(maxVote);
        in.close();
    }
}
