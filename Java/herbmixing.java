// Kattis - Herb Mixing
import java.util.*;

public class herbmixing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int greenHerb = in.nextInt();
        int redHerb = in.nextInt();

        if (greenHerb == 0) {
            System.out.println("0");
            in.close();
            return;
        }

        int totalHealthBoosted = 0;
        for (int i = 0; i < redHerb; i++) {
            if (greenHerb > 0) {
                totalHealthBoosted += 10;
                greenHerb--;
            }

        }

        int threeRemain = greenHerb / 3;
        totalHealthBoosted += threeRemain * 10;
        greenHerb -= threeRemain * 3;
        int twoRemain = greenHerb / 2;
        totalHealthBoosted += twoRemain * 3;
        greenHerb -= twoRemain * 2;

        System.out.println(totalHealthBoosted + greenHerb);
        in.close();
    }
}
