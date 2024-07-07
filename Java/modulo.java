// Kattis - Modulo
import java.util.*;

class modulo {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(in.nextInt() % 42);
        }

        System.out.println(set.size());
        in.close();
    }
}
