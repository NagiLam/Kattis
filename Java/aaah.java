// Kattis - Aaah!
import java.util.*;

class aaah {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        long count1 = input.chars().filter(ch -> ch == 'a').count();
        String neededInput = in.nextLine();
        long count2 = neededInput.chars().filter(ch -> ch == 'a').count();

        System.out.println((count1 >= count2) ? "go" : "no");
        in.close();
    }
}
