// Kattis - Baby Bites
import java.util.*;

public class babybites {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nBites = Integer.parseInt(in.nextLine());
        String[] countArr = in.nextLine().split(" ");
        boolean correctCount = true;

        for (int i = 0; i < nBites; i++) {
            if (!countArr[i].equals("mumble")) {
                int number = Integer.parseInt(countArr[i]);
                if (number != i + 1) {
                    correctCount = false;
                    break;
                }
            }
        }

        System.out.println((correctCount) ? "makes sense" : "something is fishy");
        in.close();
    }
}
