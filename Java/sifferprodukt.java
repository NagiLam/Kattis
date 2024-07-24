// Kattis - Digit Product
import java.util.*;

class sifferprodukt {
    public static int productofDigits(int input) {
        int product = 1;
        while (input > 0) {
            int digit = input % 10;
            if (digit != 0) {
                product *= input % 10;
            }
            input /= 10;
        }
        return product;
    }

    public static int reduceToSingleDigit(int input) {
        while (input >= 10) {
            input = productofDigits(input);
        }
        return input;
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());
        int result = reduceToSingleDigit(input);

        System.out.println(result);
        in.close();
    }
}
