// Kattis - Translation
import java.util.*;

public class translation {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nWords = Integer.parseInt(in.nextLine());
        String[] input = in.nextLine().trim().split(" ");
        int nSwedishWords = Integer.parseInt(in.nextLine());
        HashMap<String, String> wordsMap = new HashMap<>();

        for (int i = 0; i < nSwedishWords; i++) {
            String[] dictInput = in.nextLine().split(" ");
            wordsMap.put(dictInput[0], dictInput[1]);
        }

        for (int i = 0; i < nWords; i++) {
            System.out.print(wordsMap.get(input[i]) + " ");
        }

        in.close();
    }
}
