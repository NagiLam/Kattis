// Kattis - Bacon, Eggs, and Spam
import java.util.*;

public class baconeggsandspam {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Set<String> menuSet = new HashSet<>();
        Map<String, List<String>> itemToCustomerMap = new HashMap<>();

        while (true) {
            int nCustomers = Integer.parseInt(in.nextLine());
            if (nCustomers == 0) {
                break;
            } else {
                List<String> nameList = new ArrayList<>();
                for (int index = 0; index < nCustomers; index++) {
                    String[] input = in.nextLine().split(" ");
                    String customerName = input[0];
                    nameList.add(customerName);

                    for (int i = 1; i < input.length; i++) {
                        String item = input[i];
                        menuSet.add(item);
                        itemToCustomerMap
                                .computeIfAbsent(item, k -> new ArrayList<>())
                                .add(customerName);
                    }
                }

                List<String> sortedItems = new ArrayList<>(itemToCustomerMap.keySet());
                Collections.sort(sortedItems);

                for (String item : sortedItems) {
                    List<String> sortedCustomers = new ArrayList<>(itemToCustomerMap.get(item));
                    Collections.sort(sortedCustomers);
                    System.out.println(item + " " + String.join(" ", sortedCustomers));
                }
                
                itemToCustomerMap.clear();
            }
            System.out.println("");
        }

        in.close();
    }
}
