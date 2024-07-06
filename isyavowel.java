// Kattis - Is Y a Vowel?
import java.util.*;

class isyavowel {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        List<String> arr = Arrays.asList("a", "e", "i", "o", "u");
        List<String> arrY = Arrays.asList("a", "e", "i", "o", "u", "y");
        String s = in.nextLine();
        s = s.toLowerCase();
        int count = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            if (arr.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }

            if (arrY.contains(String.valueOf(s.charAt(i)))) {
                countY++;
            }
        }

        System.out.printf("%d %d%n", count, countY);
        in.close();
    }
}
