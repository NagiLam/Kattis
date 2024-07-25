// Kattis - Poker Hand
import java.util.*;

class pokerhand {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int count = 1;

        HashMap<Character, Integer> rankMap = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length; i++) {
            char rank = input[i].charAt(0);
            if (!rankMap.containsKey(rank)) {
                rankMap.put(rank, 1);
            } else {
                rankMap.put(rank, rankMap.get(rank) + 1);
            }
        }

        System.out.println(Collections.max(rankMap.values()));
        in.close();
    }
}
