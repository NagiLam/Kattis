// Kattis - Stuck In A Time Loop
import java.util.*;

class timeloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + " Abracadabra");
        }
        in.close();
    }
}
