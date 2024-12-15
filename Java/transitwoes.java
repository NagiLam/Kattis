// Kattis - Transit Woes
import java.util.*;

public class transitwoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leaveHouseTime = in.nextInt();
        int firstClassTime = in.nextInt();
        int nTransitRoutes = in.nextInt();

        int walkingTime[] = new int[nTransitRoutes + 1];
        for (int i = 0; i <= nTransitRoutes; i++) {
            walkingTime[i] = in.nextInt();
        }

        int busTime[] = new int[nTransitRoutes];
        for (int i = 0; i < nTransitRoutes; i++) {
            busTime[i] = in.nextInt();
        }

        int busInterval[] = new int[nTransitRoutes];
        for (int i = 0; i < nTransitRoutes; i++) {
            busInterval[i] = in.nextInt();
        }

        int totalTime = 0;
        for (int i = 0; i < nTransitRoutes; i++) {
            totalTime += walkingTime[i];

            if (totalTime % busInterval[i] != 0) {
                totalTime += busInterval[i] - (totalTime % busInterval[i]);
            }

            totalTime += busTime[i];
        }

        totalTime += walkingTime[nTransitRoutes];

        if (totalTime <= firstClassTime) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        in.close();
    }
}
