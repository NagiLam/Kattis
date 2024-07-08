// Kattis - Reduplication
import java.util.*;

class reduplikation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int repeatNum = in.nextInt();
        in.close();

        for (int i = 0; i < repeatNum; i++) {
            System.out.print(word);
        }
    }
}
