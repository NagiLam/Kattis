// Kattis - Turn It Up!
import java.util.*;

class skruop {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nRequests = Integer.parseInt(in.nextLine());
        int currentValue = 7;
        String up = "Skru op!";
        String down = "Skru ned!";

        for (int i = 0; i < nRequests; i++) {
            String input = in.nextLine();
            if (input.equals(up) && currentValue < 10) {
                currentValue++;
            } else if (input.equals(down) && currentValue > 0) {
                currentValue--;
            }
        }

        System.out.println(currentValue);
        in.close();
    }
}
