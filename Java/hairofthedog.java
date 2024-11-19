// Kattis - Hair of the Dog
import java.util.*;

public class hairofthedog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nDays = Integer.parseInt(in.nextLine());
        int hangOverCount = 0;
        boolean wasDrunkYesterday = false;

        for (int i = 0; i < nDays; i++) {
            String dayState = in.nextLine();
            if (dayState.equals("sober")) {
                if (wasDrunkYesterday) {
                    hangOverCount++;
                }
                wasDrunkYesterday = false;
            }

            else if (dayState.equals("drunk")) {
                wasDrunkYesterday = true;
            }
        }

        System.out.println(hangOverCount);
        in.close();
    }
}
