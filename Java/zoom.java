// Kattis - Zoom
import java.util.*;

public class zoom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumbers = in.nextInt();
        int kValue = in.nextInt();
        int count = 1;
        in.nextLine();

        String[] input = in.nextLine().split(" ");
        while (count * kValue - 1 < input.length) {
            System.out.print(input[count * kValue - 1] + " ");
            count++;
        }

        in.close();
    }
}
