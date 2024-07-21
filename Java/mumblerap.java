// Kattis - Mumble Rap
import java.util.*;

class mumblerap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nChars = Integer.parseInt(in.nextLine());
        String[] input = in.nextLine().split("\\D+");
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (!input[i].isEmpty() && Integer.parseInt(input[i]) > maxValue)
                maxValue = Integer.parseInt(input[i]);
        }

        System.out.println(maxValue);
        in.close();
    }
}
