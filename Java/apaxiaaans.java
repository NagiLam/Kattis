// Kattis - Apaxiaaaaaaaaaaaans!
import java.util.*;

class apaxiaaans {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        char previousChar = name.charAt(0);
        StringBuilder result = new StringBuilder();
        result.append(previousChar);

        for (int i = 1; i < name.length(); i++) {
            if (previousChar != name.charAt(i)) {
                result.append(name.charAt(i));
                previousChar = name.charAt(i);
            }
        }

        System.out.println(result);
        in.close();
    }
}
