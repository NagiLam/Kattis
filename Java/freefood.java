// Kattis - Free Food
import java.util.*;

public class freefood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nEvents = Integer.parseInt(in.nextLine());
        Set<Integer> foodDays = new HashSet<>();

        for (int i = 0; i < nEvents; i++) {
            int startDay = in.nextInt();
            int endDay = in.nextInt();

            for (int day = startDay; day <= endDay; day++) {
                foodDays.add(day);
            }
        }

        System.out.println(foodDays.size());
        in.close();
    }
}
