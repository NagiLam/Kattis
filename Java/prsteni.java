// Kattis - Prsteni
import java.util.*;

public class prsteni {
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nRings = Integer.parseInt(in.nextLine());
        int firstRingRadii = in.nextInt();

        for (int i = 1; i < nRings; i++) {
            int ringRadii = in.nextInt();
            if (firstRingRadii % ringRadii == 0) {
                System.out.println((firstRingRadii / ringRadii) + "/1");
            } else {
                int gcd = findGCD(firstRingRadii, ringRadii);
                System.out.println((firstRingRadii / gcd) + "/" + (ringRadii / gcd));
            }
        }

        in.close();
    }
}
