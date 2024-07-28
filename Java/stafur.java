import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class stafur {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] vowels = new String[] { "A", "E", "I", "O", "U" };
        String input = in.nextLine();
        if (Arrays.asList(vowels).contains(input)) {
            System.out.println("Jebb");
        }

        else if (input.equals("Y")) {
            System.out.println("Kannski");
        }

        else {
            System.out.println("Neibb");
        }
        in.close();
    }
}
