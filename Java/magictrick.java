// Kattis - Magic Trick
import java.util.Scanner;

public class magictrick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        boolean flag = true;

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            long countA = input.chars().filter(ch -> ch == a).count();
            if (countA > 1) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "1" : "0");
        in.close();
    }
}
