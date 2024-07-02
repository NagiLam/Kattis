// Katis - Take Two Stones
import java.util.*;

class twostones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nStones = Integer.parseInt(in.nextLine());
        in.close();

        if (nStones % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
