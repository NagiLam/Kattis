// Kattis - Mæting
import java.util.*;

class maeting {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int monAtt = in.nextInt();
        int tueAtt = in.nextInt();
        in.nextLine();

        String[] mon = in.nextLine().split(" ");
        Set<String> tueSet = Set.of(in.nextLine().split(" "));
        Set<String> resultSet = new LinkedHashSet<>();

        for (String elements : mon) {
            if (tueSet.contains(elements)) {
                resultSet.add(elements);
            }
        }

        for (String elements : resultSet) {
            System.out.print(elements + " ");
        }

        in.close();
    }
}
