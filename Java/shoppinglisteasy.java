// Kattis - Shopping List (Easy)
import java.util.*;

public class shoppinglisteasy {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nLists = in.nextInt();
        int nItemOnList = in.nextInt();
        in.nextLine();

        ArrayList<String> allItems = new ArrayList<>();
        Set<String> uniqueItems = new HashSet<>();

        for (int i = 0; i < nLists; i++) {
            String[] inputItems = in.nextLine().split(" ");
            Collections.addAll(allItems, inputItems);
            uniqueItems.addAll(Arrays.asList(inputItems));
        }

        List<String> commonItems = new ArrayList<>();
        for (String item : uniqueItems) {
            if (Collections.frequency(allItems, item) == nLists) {
                commonItems.add(item);
            }
        }

        System.out.println(commonItems.size());
        Collections.sort(commonItems);
        commonItems.forEach(System.out::println);
        in.close();
    }
}
