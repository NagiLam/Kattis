// Kattis - Echo Echo Echo
import java.util.*;

class echoechoecho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print(s + " ");
        }
        in.close();
    }
}
