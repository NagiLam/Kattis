// Kattis - Odd Man Out
import java.util.*;

class oddmanout {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nCases; i++) {
            int nGuests = Integer.parseInt(in.nextLine());
            HashSet<String> guests = new HashSet<String>();
            String[] num = in.nextLine().split(" ");

            for (int j = 0; j < nGuests; j++) {
                if (guests.add(num[j]) == false) {
                    guests.remove(num[j]);
                }
            }

            System.out.print("Case #" + (i + 1) + ": ");
            Iterator it = guests.iterator();
            System.out.println(it.next());
        }

        in.close();
    }
}
