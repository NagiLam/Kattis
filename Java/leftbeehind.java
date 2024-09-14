// Kattis - Left Beehind
import java.util.*;

public class leftbeehind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String input = in.nextLine();
            if (input.equals("0 0")) {
                break;
            }
          
            String honey[] = input.split(" ");
            int sweetHoney = Integer.parseInt(honey[0]);
            int sourHoney = Integer.parseInt(honey[1]);

            if (sweetHoney > sourHoney && (sweetHoney + sourHoney != 13)) {
                System.out.println("To the convention.");
            } else if (sweetHoney < sourHoney && (sweetHoney + sourHoney != 13)) {
                System.out.println("Left beehind.");
            } else if (sweetHoney + sourHoney == 13) {
                System.out.println("Never speak again.");
            } else {
                System.out.println("Undecided.");
            }
        }
        
        in.close();
    }
}
