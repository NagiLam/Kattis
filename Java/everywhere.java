// Kattis - I've Been Everywhere, Man
import java.util.*;

class everywhere {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nTestcases = Integer.parseInt(in.nextLine());
        List<String> lastVisit = new ArrayList<>();

        for (int i = 0; i < nTestcases; i++) {
            int nTrips = Integer.parseInt(in.nextLine());
            int count = 0;
            for (int j = 0; j < nTrips; j++) {
                String s = in.nextLine();
                if (!lastVisit.contains(s)) {
                    lastVisit.add(s);
                    count++;
                }
            }
            System.out.println(count);
        }

        in.close();
    }
}
