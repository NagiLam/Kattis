// Kattis - Bijele
import java.util.*;

class bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pieces = { 1, 1, 2, 2, 2, 8 };
        int[] input = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < input.length; i++) {
            if (input[i] > pieces[i]) {
                input[i] = pieces[i] - input[i];
                continue;
            }

            if (input[i] == pieces[i]) {
                input[i] = 0;
                continue;
            }

            if (input[i] < pieces[i]) {
                input[i] = pieces[i] - input[i];
                continue;
            }
        }

        for (int i : input) {
            System.out.print(i + " ");
        }
        in.close();
    }
}
