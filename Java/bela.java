// Kattis - Bela
import java.util.*;

class bela {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nHands = in.nextInt();
        String suitDominant = in.next();
        in.nextLine();

        Map<String, Integer> mapDominant = new HashMap<String, Integer>() {
            {
                put("A", 11);
                put("K", 4);
                put("Q", 3);
                put("J", 20);
                put("T", 10);
                put("9", 14);
                put("8", 0);
                put("7", 0);
            }
        };

        Map<String, Integer> mapNotDominant = new HashMap<String, Integer>() {
            {
                put("A", 11);
                put("K", 4);
                put("Q", 3);
                put("J", 2);
                put("T", 10);
                put("9", 0);
                put("8", 0);
                put("7", 0);
            }
        };

        int scoreCount = 0;
        for (int i = 0; i < nHands * 4; i++) {
            String card = in.nextLine();
            if (card.charAt(1) == suitDominant.charAt(0)) {
                scoreCount += mapDominant.get(String.valueOf(card.charAt(0)));
            } else {
                scoreCount += mapNotDominant.get(String.valueOf(card.charAt(0)));
            }
        }

        System.out.println(scoreCount);
        in.close();
    }
}
