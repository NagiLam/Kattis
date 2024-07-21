// Kattis - Tok Tik
import java.util.*;

class toktik {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nTiktoks = Integer.parseInt(in.nextLine());
        Map<String, Integer> mapValue = new HashMap<String, Integer>();
        int maxValue = Integer.MIN_VALUE;
        String maxName = "";

        for (int i = 0; i < nTiktoks; i++) {
            String[] input = in.nextLine().split(" ");
            String name = input[0];
            int value = Integer.parseInt(input[1]);
            int currentValue = mapValue.getOrDefault(name, 0) + value;
            mapValue.put(name, currentValue);

            if (currentValue > maxValue) {
                maxValue = currentValue;
                maxName = name;
            }
        }

        System.out.println(maxName);
        in.close();
    }
}
