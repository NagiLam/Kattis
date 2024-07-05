// Kattis - Knot Knowledge
import java.util.*;

class knotknowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nLearns = Integer.parseInt(in.nextLine());
        List<Integer> knotList = new ArrayList<>(nLearns);

        for (int i = 0; i < nLearns; i++) {
            knotList.add(in.nextInt());
        }

        for (int j = 0; j < (nLearns - 1); j++) {
            knotList.remove(Integer.valueOf(in.nextInt()));
        }

        System.out.println(knotList.get(0));
        in.close();
    }
}
