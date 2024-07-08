// Kattis - Monopoly 
import java.util.*;

class monopol {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nHotels = Integer.parseInt(in.nextLine());
        Set<Integer> set = new HashSet<>();

        for (int m = 0; m < nHotels; m++) {
            set.add(in.nextInt());
        }

        int total = 0;
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                total += 1;
                if (set.contains(i + j)) {
                    count += 1;
                }
            }
        }

        System.out.println((double) count / total);
        in.close();
    }
}
