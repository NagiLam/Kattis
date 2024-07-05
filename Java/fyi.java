// Kattis - FYI
import java.util.*;

class fyi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String teleNum = in.nextLine();

        System.out.println((teleNum.substring(0, 3).equals("555")
                ? "1"
                : "0"));
    }
}
