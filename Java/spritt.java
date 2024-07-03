// Kattis - Spritt
import java.util.*;

class spritt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nRoom = in.nextInt();
        int nBottles = in.nextInt();
        int count = 0;

        for (int i = 0; i < nRoom; i++) {
            count += in.nextInt();
        }

        System.out.println((count <= nBottles) ? "Jebb" : "Neibb");
        in.close();
    }
}
