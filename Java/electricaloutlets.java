// Kattis - Electrical Outlets
import java.util.*;

public class electricaloutlets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            int nPowerStrips = in.nextInt();
            int nMaxAppliances = 0;
            for (int j = 0; j < nPowerStrips; j++) {
                nMaxAppliances += in.nextInt();
            }

            System.out.println(nMaxAppliances - nPowerStrips + 1);
        }

        in.close();
    }
}
