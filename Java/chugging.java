// Kattis - Chugging
import java.util.*;

public class chugging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nBottles = in.nextInt();
        int aliceTimePerBottle = in.nextInt();
        int aliceTimeDelay = in.nextInt();
        int bobTimePerBottle = in.nextInt();
        int bobTimeDelay = in.nextInt();

        int aliceTotalTime = aliceTimePerBottle * nBottles;
        int bobTotalTime = bobTimePerBottle * nBottles;

        for (int i = 0; i < nBottles; i++) {
            aliceTotalTime += aliceTimeDelay * i;
            bobTotalTime += bobTimeDelay * i;
        }

        if (aliceTotalTime < bobTotalTime) {
            System.out.println("Alice");
        } else if (aliceTotalTime > bobTotalTime) {
            System.out.println("Bob");
        } else {
            System.out.println("=");
        }

        in.close();
    }
}
