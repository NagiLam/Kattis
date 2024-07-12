// Kattis - Grass Seed Inc.
import java.util.*;

class grassseed {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        double cost = Double.parseDouble(in.nextLine());
        int nLawns = Integer.parseInt(in.nextLine());
        double sumArea = 0;

        for (int i = 0; i < nLawns; i++) {
            sumArea += in.nextDouble() * in.nextDouble();
        }

        System.out.printf("%.8f", cost * sumArea);
        in.close();
    }
}
