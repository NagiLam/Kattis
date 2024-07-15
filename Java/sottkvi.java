// Kattis - Sóttkví
import java.util.*;

class sottkvi {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nFriends = in.nextInt();
        int untilBd = in.nextInt();
        int today = in.nextInt();
        int count = 0;

        for (int i = 0; i < nFriends; i++) {
            int dayQ = in.nextInt();
            if (today - dayQ + untilBd >= 14){
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
