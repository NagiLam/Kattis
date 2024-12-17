// Kattis - ABC
import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            numberList.add(in.nextInt());
        }

        in.nextLine();
        String input = in.nextLine();
        Collections.sort(numberList);

        int letterA = numberList.get(0);
        int letterB = numberList.get(1);
        int letterC = numberList.get(2);

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                System.out.print(letterA + " ");
            } else if (input.charAt(i) == 'B') {
                System.out.print(letterB + " ");
            } else {
                System.out.print(letterC + " ");
            }
        }

        in.close();
    }
}
