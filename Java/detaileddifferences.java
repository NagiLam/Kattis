// Kattis - Detailed Differences
import java.util.*;

class detaileddifferences {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nTest = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTest; i++) {
            String s = in.nextLine();
            String s2 = in.nextLine();
            String result = "";

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s2.charAt(j)) {
                    result += ".";
                } else {
                    result += "*";
                }
            }

            System.out.println(s);
            System.out.println(s2);
            System.out.println(result);
            System.out.println(" ");
        }

        in.close();
    }
}
