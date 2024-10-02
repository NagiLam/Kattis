// Kattis - Thoring test
import java.util.*;

public class thoringtest {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nWords = Integer.parseInt(in.nextLine());
        Set<String> wordsSet = new HashSet<>();

        for (int i = 0; i < nWords; i++) {
            wordsSet.add(in.nextLine().toLowerCase());
        }

        String[] sentence = in.nextLine().toLowerCase().split(" ");
        boolean correctSpelled = true;

        for (String word : sentence) {
            if (!wordsSet.contains(word)) {
                correctSpelled = false;
                break;
            }
        }

        System.out.println((correctSpelled) ? "Hi, how do I look today?" : "Thore has left the chat");
        in.close();
    }
}
