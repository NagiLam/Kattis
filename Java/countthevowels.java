// Kattis - Count the Vowels
import java.util.*;

class countthevowels {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        List<String> arr = Arrays.asList("a", "e", "i", "o", "u");
        String s = in.nextLine();
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (arr.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
