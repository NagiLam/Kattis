// Kattis - Gluttonous George
import java.util.*;

public class goggi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input[] = in.nextLine().split(" \\? ");
        int firstNum = Integer.parseInt(input[0]);
        int secondNum = Integer.parseInt(input[1]);

        if (firstNum > secondNum) {
            System.out.println(">");
        }

        else if (firstNum < secondNum) {
            System.out.println("<");
        }

        else {
            System.out.println("Goggi svangur!");
        }
        in.close();
    }
}
