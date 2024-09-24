// Kattis - The Key to Cryptography
import java.util.*;

public class keytocrypto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cipherText = in.nextLine().toUpperCase();
        String secretWord = in.nextLine().toUpperCase();
        String originalText = "";

        for (int i = 0; i < cipherText.length(); i++) {
            char charCipher = cipherText.charAt(i);
            char charKey = secretWord.charAt(i);
            int charDecrypt = charCipher - charKey;

            charDecrypt = charDecrypt < 0 ? charDecrypt + 26 : charDecrypt;
            charDecrypt += 65;
            originalText += (char) charDecrypt;
            secretWord += (char) charDecrypt;
        }

        System.out.println(originalText);
        in.close();
    }
}
