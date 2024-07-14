// Kattis - Ekki dauði opna inni
import java.util.*;

class ekkidaudi {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String[] word1 = in.nextLine().split("\\|");
        String[] word2 = in.nextLine().split("\\|");

        System.out.println(word1[0] + word2[0] + " " + word1[1] + word2[1]);
        in.close();
    }
}
