// Kattis - Missing Numbers
import java.util.*;

public class missingnumbers {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int nInteger = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nInteger; i++) {
            numberList.add(Integer.parseInt(in.nextLine()));
        }

        HashSet<Integer> numberSet = new HashSet<>(numberList);
        int first = 1;
        int last = numberList.get(numberList.size() - 1);
        boolean allPresent = true;

        for (int i = first; i <= last; i++) {
            if (!numberSet.contains(i)) {
                System.out.println(i);
                allPresent = false;
            }
        }

        if (allPresent) {
            System.out.println("good job");
        }

        in.close();
    }
}
