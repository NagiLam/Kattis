// Kattis - Encoded Message
import java.util.Scanner;

class encodedmessage {
    
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestCases; i++) {
            String input = in.nextLine();
            int sideLength = (int) Math.sqrt(input.length());
            StringBuilder decodedMessage = new StringBuilder(input.length());

            for (int col = sideLength - 1; col >= 0; col--) {
                for (int row = 0; row < sideLength; row++) {
                    decodedMessage.append(input.charAt(row * sideLength + col));
                }
            }

            System.out.println(decodedMessage.toString());
        }

        in.close();
    }
}
