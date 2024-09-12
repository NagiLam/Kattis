// Kattis - Úllen dúllen doff
import java.util.*;

public class ullendullendoff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mantra = 13;
        int nFriends = Integer.parseInt(in.nextLine());
        String[] input = in.nextLine().split(" ");

        int index = (mantra % nFriends) - 1;
        if (index == -1) {
            index = nFriends - 1;
        }

        System.out.println(input[index]);
        in.close();
    }
}
