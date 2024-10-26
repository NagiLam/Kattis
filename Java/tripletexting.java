// Kattis - Triple Texting
import java.util.*;

public class tripletexting {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int wordLength = input.length() / 3;

        String firstWord = input.substring(0, wordLength);
        String secondWord = input.substring(wordLength, wordLength * 2);
        String thirdWord = input.substring(wordLength * 2);

        if (firstWord.equals(secondWord) || firstWord.equals(thirdWord)) {
            System.out.println(firstWord);
        }

        else if (secondWord.equals(thirdWord)) {
            System.out.println(secondWord);
        }

        else {
            System.out.println(firstWord);
        }

        in.close();
    }
}
