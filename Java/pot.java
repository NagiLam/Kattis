// Kattis - Pot
import java.util.*;

class pot {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        long sum = 0;

        for (int i = 0; i < number; i++) {
            int input = in.nextInt();
            sum += Math.pow((input / 10), (input % 10));
        }

        System.out.println(sum);
        in.close();
    }
}
