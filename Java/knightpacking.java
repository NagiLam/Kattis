// Kattis - Knight Packing
import java.util.*;

class knightpacking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        System.out.println((size % 2 == 0) ? "second" : "first");
        in.close();
    }
}
