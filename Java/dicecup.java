// Kattis - Dice Cup
import java.util.*;
import java.util.Map.Entry;

class dicecup {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int dice1 = in.nextInt();
        int dice2 = in.nextInt();
        Map<Integer, Integer> diceMap = new HashMap<>();

        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                if (!diceMap.containsKey(i + j)) {
                    diceMap.put(i + j, 1);
                } else {
                    diceMap.put(i + j, diceMap.get(i + j) + 1);
                }
            }
        }

        int maxValue = Collections.max(diceMap.values());
        List<Integer> maxKeys = new ArrayList<>();
        for (Entry<Integer, Integer> entry : diceMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxKeys.add(entry.getKey());
            }
        }

        for (Integer num : maxKeys) {
            System.out.print(num + " ");
        }

        in.close();
    }
}
