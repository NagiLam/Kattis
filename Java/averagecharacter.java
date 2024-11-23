// Kattis - Average Character
import java.util.*;

public class averagecharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int totalASCIIValue = 0;

        for (int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
            totalASCIIValue += (int) index;
        }

        int averageASCIIValue = totalASCIIValue / input.length();
        System.out.println((char) averageASCIIValue);
        in.close();
    }
}
