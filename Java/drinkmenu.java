// Kattis - Drink Menu
import java.util.*;

public class drinkmenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nDrinks = in.nextInt();
        int nOrders = in.nextInt();
        in.nextLine();

        String[] drinkNames = new String[nDrinks];
        for (int i = 0; i < nDrinks; i++) {
            drinkNames[i] = in.nextLine();
        }

        Map<String, Integer> customerIndexes = new HashMap<>();
        for (int i = 0; i < nOrders; i++) {
            String customer = in.nextLine();
            int nextIndex = customerIndexes.getOrDefault(customer, 0);
            System.out.println(drinkNames[nextIndex]);
            customerIndexes.put(customer, (nextIndex + 1) % nDrinks);
        }

        in.close();
    }
}
