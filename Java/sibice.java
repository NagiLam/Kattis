// Kattis - Sibice
import java.util.*;

class sibice {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nMatches = in.nextInt();
        int width = in.nextInt();
        int height = in.nextInt();
        int maxLength = (int) Math.sqrt((width * width) + (height * height));

        for (int i = 0; i < nMatches; i++) {
            int length = in.nextInt();
            System.out.println((length <= maxLength ? "DA" : "NE"));
        }

        in.close();
    }
}
