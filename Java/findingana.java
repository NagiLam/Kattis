// Kattis - Finding An A
import java.util.*;

class findingana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(s.substring(s.indexOf("a")));
        in.close();
    }
}
