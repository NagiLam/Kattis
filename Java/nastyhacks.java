// Kattis - Nasty Hacks
import java.util.*;

class nastyhacks {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < cases; i++) {
            int expRevAd = in.nextInt();
            int expRevNotAd = in.nextInt();
            int adCost = in.nextInt();

            if (expRevNotAd - adCost < expRevAd) {
                System.out.println("do not advertise");
                continue;
            }

            if (expRevNotAd - adCost == expRevAd) {
                System.out.println("does not matter");
                continue;
            }

            System.out.println("advertise");
        }

        in.close();
    }
}
