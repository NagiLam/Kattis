// Kattis - Sauna
import java.util.*;

public class sauna {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nPeople = Integer.parseInt(in.nextLine());

        int startOverlap = in.nextInt();
        int endOverlap = in.nextInt();

        for (int i = 1; i < nPeople; i++) {
            int startIndex = in.nextInt();
            int endIndex = in.nextInt();

            startOverlap = Math.max(startOverlap, startIndex);
            endOverlap = Math.min(endOverlap, endIndex);

            if (startOverlap > endOverlap) {
                System.out.println("bad news");
                in.close();
                return;

            }
        }

        int overlapSize = endOverlap - startOverlap + 1;
        if (overlapSize > 0) {
            System.out.println(overlapSize);
            System.out.println(startOverlap);
        } else {
            System.out.println("bad news");
        }

        in.close();
    }
}
