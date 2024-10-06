// Kattis - Soda Slurper
import java.util.*;

public class sodaslurper {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nEmptyBottlesPosses = in.nextInt();
        int nEmptyBottlesFound = in.nextInt();
        int nEmptyBottlesRequireToBuy = in.nextInt();
        int count = 0;

        int totalBottles = nEmptyBottlesFound + nEmptyBottlesPosses;
        while (totalBottles >= nEmptyBottlesRequireToBuy) {
            int sodas = totalBottles / nEmptyBottlesRequireToBuy;
            count += sodas;
            totalBottles = totalBottles % nEmptyBottlesRequireToBuy + sodas;
        }

        System.out.println(count);
        in.close();
    }
}
