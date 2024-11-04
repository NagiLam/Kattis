// Kattis - Dishonest Lottery
import java.util.*;

public class dishonestlottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nLottery = Integer.parseInt(in.nextLine());
        int numInLottery = 5;
        int threshold = 2 * nLottery;

        List<Integer> numberList = new ArrayList<>();
        List<Integer> suspiciousList = new ArrayList<>();
        for (int i = 0; i < nLottery * 10; i++) {
            for (int j = 0; j < numInLottery; j++) {
                int numberInput = in.nextInt();
                numberList.add(numberInput);
            }
        }

        Set<Integer> numberSet = new HashSet<Integer>(numberList);
        for (Integer number : numberSet) {
            int count = Collections.frequency(numberList, number);
            if (count > threshold) {
                suspiciousList.add(number);
            }
        }

        Collections.sort(suspiciousList);
        if (suspiciousList.isEmpty()) {
            System.out.println("-1");
        } else {
            for (Integer integer : suspiciousList) {
                System.out.print(integer + " ");
            }
        }

        in.close();
    }
}
