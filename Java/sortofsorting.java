// Kattis - Sort of Sorting
import java.util.*;

public class sortofsorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            List<String> nameList = new ArrayList<>();
            int nCases = Integer.parseInt(in.nextLine());

            if (nCases == 0) {
                break;
            } else {

                for (int i = 0; i < nCases; i++) {
                    nameList.add(in.nextLine());
                }
            }

            Collections.sort(nameList, new Comparator<String>() {
                @Override
                public int compare(String name1, String name2) {
                    return name1.substring(0, 2).compareTo(name2.substring(0, 2));
                }
            });

            for (String name : nameList) {
                System.out.println(name);
            }
            System.out.println();
        }

        in.close();
    }
}
