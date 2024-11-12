// Kattis - Airfare Grants
import java.util.*;

public class airfaregrants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nAvaiFlights = Integer.parseInt(in.nextLine());
        List<Integer> ticketPrice = new ArrayList<>();

        for (int i = 0; i < nAvaiFlights; i++) {
            ticketPrice.add(Integer.parseInt(in.nextLine()));
        }

        Collections.sort(ticketPrice);
        int maxPrice = ticketPrice.getLast();
        int minPrice = ticketPrice.getFirst();
        int priceYouPay = (maxPrice / 2) - minPrice;

        if (priceYouPay < 0) {
            System.out.println(Math.abs(priceYouPay));
        } else {
            System.out.println("0");
        }

        in.close();
    }
}
