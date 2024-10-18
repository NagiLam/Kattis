// Kattis - Riječi
import java.util.*;

public class rijeci {
    public static int[] countLetters(int nButtonPressed) {
        int countA = 1;
        int countB = 0;

        for (int i = 0; i < nButtonPressed; i++) {
            int newA = countB;
            int newB = countA + countB;
            countA = newA;
            countB = newB;
        }

        return new int[] { countA, countB };
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nButtonPressed = Integer.parseInt(in.nextLine());
        int[] result = countLetters(nButtonPressed);
        
        System.out.println(result[0] + " " + result[1]);
        in.close();
    }
}
