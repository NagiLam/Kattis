// Kattis - Trik
import java.util.*;

class trik {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int ballPos = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' && (ballPos == 1 || ballPos == 2)) {
                if (ballPos == 1) {
                    ballPos = 2;
                } else {
                    ballPos = 1;
                }
            }

            else if (input.charAt(i) == 'B' && (ballPos == 2 || ballPos == 3)) {
                if (ballPos == 2) {
                    ballPos = 3;
                } else {
                    ballPos = 2;
                }
            }

            else if (input.charAt(i) == 'C' && (ballPos == 1 || ballPos == 3)) {
                if (ballPos == 1) {
                    ballPos = 3;
                } else {
                    ballPos = 1;
                }
            }
        }

        System.out.println(ballPos);
        in.close();
    }
}
