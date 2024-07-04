// Kattis - Oddities
import java.util.*;

class oddities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            int number = in.nextInt();
            System.out.println((number % 2 == 0)
                    ? number + " is even"
                    : number + " is odd");
        }

        in.close();
    }
}
