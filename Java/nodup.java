// Kattis - No Duplicates
import java.util.*;

class nodup {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("\\s+");
        HashSet<String> inSet = new HashSet<String>();
        boolean flag = true;

        for (String word : input) {
            if (inSet.contains(word)) {
                flag = false;
            } else {
                inSet.add(word);
            }
        }

        System.out.println((flag == true) ? "yes" : "no");
        in.close();
    }
}
