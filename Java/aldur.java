// Kattis - Aldur
import java.util.*;

public class aldur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nFriends = Integer.parseInt(in.nextLine());
        List<Integer> ageList = new ArrayList<>();

        for (int i = 0; i < nFriends; i++) {
            ageList.add(Integer.parseInt(in.nextLine()));
        }

        System.out.println(Collections.min(ageList));
        in.close();
    }
}
