// Kattis - Odd Echo
import java.util.*;

class oddecho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nLines = Integer.parseInt(in.nextLine());
        String[] result = new String[nLines];

        for (int i = 0; i < nLines; i++) {
            String word = in.nextLine();
            if (i % 2 == 0 || i == 0) {
                result[i] = word;
            }
        }

        for (String word : result) {
            if (word != null) {
                System.out.println(word);
            }
        }
        in.close();
    }
}
