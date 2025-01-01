// Kattis - Mult!
import java.util.*;

public class mult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthNumSeq = Integer.parseInt(in.nextLine());

        if (lengthNumSeq == 0) {
            in.close();
            return;
        }

        int[] numbers = new int[lengthNumSeq];
        for (int i = 0; i < lengthNumSeq; i++) {
            if (in.hasNextInt()) {
                numbers[i] = Integer.parseInt(in.nextLine());
            } else {
                in.close();
                return;
            }
        }

        for (int i = 0; i < lengthNumSeq - 1; i++) {
            int number = numbers[i];
            boolean found = false;

            for (int j = i + 1; j < lengthNumSeq; j++) {
                if (numbers[j] % number == 0) {
                    System.out.println(numbers[j]);
                    i = j;
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }
        }

        in.close();
    }
}
