// Kattis - Which is Greater?
import java.util.*;

class whichisgreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println((in.nextInt() > in.nextInt() ? "1" : "0"));
        in.close();
    }
}
