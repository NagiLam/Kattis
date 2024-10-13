// Kattis - Statistics
import java.util.*;

public class statistics {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int index = 1;

        while (in.hasNext()) {
            int nNumbers = in.nextInt();
            ArrayList<Integer> numberList = new ArrayList<>();

            for (int i = 0; i < nNumbers; i++) {
                numberList.add(in.nextInt());
            }

            int min = Collections.min(numberList);
            int max = Collections.max(numberList);
            int range = max - min;
            System.out.println("Case " + index + ": " + min + " " + max + " " + range);
            index++;
        }

        in.close();
    }
}
