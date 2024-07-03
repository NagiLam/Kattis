// Kattis - Besta gjöfin
import java.util.*;

class bestagjofin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nGuests = Integer.parseInt(in.nextLine());
        String guestName = "";
        int count = 0;

        for (int i = 0; i < nGuests; i++) {
            String name = in.next();
            int funValue = in.nextInt();

            if (funValue > count) {
                count = funValue;
                guestName = name;
            }
        }
        System.out.println(guestName);
        in.close();
    }
}
