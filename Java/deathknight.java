// Kattis - Death Knight Hero
import java.util.*;

class deathknight {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nBattles = Integer.parseInt(in.nextLine());
        int count = nBattles;

        for (int i = 0; i < nBattles; i++) {
            if (in.nextLine().contains("CD")) {
                count--;
            }
        }

        System.out.println(count);
        in.close();
    }
}
