// Kattis - Drunk Vigenère
import java.util.*;

public class drunkvigenere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encryptedMess = in.nextLine();
        String key = in.nextLine();
        StringBuilder decryptedMess = new StringBuilder();

        for (int i = 0; i < encryptedMess.length(); i++) {
            char encryptedChar = encryptedMess.charAt(i);
            char keyChar = key.charAt(i);
            int decryptedChar;

            if (i % 2 == 0) {
                decryptedChar = (encryptedChar - keyChar + 26) % 26;
            } else {
                decryptedChar = (encryptedChar + keyChar - 2 * 'A') % 26;
            }

            decryptedMess.append((char) (decryptedChar + 'A'));
        }

        System.out.println(decryptedMess.toString());
        in.close();
    }
}
