// Kattis - Reversed Binary Numbers
import java.util.*;

class reversebinary {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String binaryString = Integer.toBinaryString(in.nextInt());
        StringBuilder reverse = new StringBuilder();
        reverse.append(binaryString);
        reverse.reverse();

        System.out.println(Integer.parseInt(reverse.toString(), 2));
        in.close();
    }
}
