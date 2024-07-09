// Kattis - Pet
import java.util.*;

class pet {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int index = 0;
        int maxGrade = 0;

        for (int i = 1; i < 6; i++) {
            int sum = Arrays.stream(in.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sum();
            if (sum > maxGrade) {
                maxGrade = sum;
                index = i;
            }
        }

        System.out.printf("%d %d%n", index, maxGrade);
        in.close();
    }
}
