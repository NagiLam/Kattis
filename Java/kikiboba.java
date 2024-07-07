// Kattis - Kiki Boba
import java.util.*;

class kikiboba {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        long countB = word.chars().filter(ch -> ch == 'b').count();
        long countK = word.chars().filter(ch -> ch == 'k').count();

        if (countB > countK) {
            System.out.println("boba");
        }

        if (countK > countB) {
            System.out.println("kiki");
        }

        if (countB == countK && countB != 0) {
            System.out.println("boki");
        }

        if (countB == 0 && countK == 0) {
            System.out.println("none");
        }
        in.close();
    }
}
