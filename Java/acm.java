// Kattis - ACM Contest Scoring
import java.util.*;

public class acm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0, timeMeasure = 0;
        List<String> solvedList = new ArrayList<>();
        List<String> attemptedList = new ArrayList<>();

        while (true) {
            String input = in.nextLine();
            if (input.equals("-1")) {
                break;
            }

            String[] inputRead = input.split(" ");
            if (inputRead[2].equals("right")) {
                timeMeasure += Integer.parseInt(inputRead[0]);
                count += 1;
                solvedList.add(inputRead[1]);
            } else if (inputRead[2].equals("wrong")) {
                attemptedList.add(inputRead[1]);
            }
        }

        for (String string : attemptedList) {
            if (solvedList.contains(string)) {
                timeMeasure += 20;
            }
        }
        System.out.printf("%d %d", count, timeMeasure);
        in.close();
    }
}
