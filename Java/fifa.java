// Kattis - Framtíðar FIFA
import java.util.*;

class fifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.close();

        System.out.println(2022 + (n/k));
    }
}
