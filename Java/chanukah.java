// Kattis - Chanukah Challenge
import java.util.*;

class chanukah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nDatasets = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nDatasets; i++) {
            in.next();
            int nDays = Integer.parseInt(in.next());
            System.out.println((i + 1) + " " + (((nDays * (nDays + 1)) / 2) + nDays));
        }

        in.close();
    }
}
