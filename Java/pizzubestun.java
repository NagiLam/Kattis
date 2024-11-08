// Kattis - Pizzubestun
import java.util.*;

public class pizzubestun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nPizzaOrder = Integer.parseInt(in.nextLine());
        List<Long> pizzaPrice = new ArrayList<>();

        for (int i = 0; i < nPizzaOrder; i++) {
            String[] input = in.nextLine().split(" ");
            pizzaPrice.add(Long.parseLong(input[1]));
        }

        Collections.sort(pizzaPrice);
        long minimumPrice = 0;

        for (int i = pizzaPrice.size() - 1; i >= 0; i -= 2) {
            minimumPrice += pizzaPrice.get(i);
        }

        System.out.println(minimumPrice);
        in.close();
    }
}
