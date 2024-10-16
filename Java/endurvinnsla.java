// Kattis - Endurvinnsla
import java.util.*;

public class endurvinnsla {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String cityName = in.nextLine();
        double allowPercent = Double.parseDouble(in.nextLine());
        int nItems = Integer.parseInt(in.nextLine());
        int countNonPlastic = 0;

        for (int i = 0; i < nItems; i++) {
            String input = in.nextLine();
            if (input.equals("ekki plast")) {
                countNonPlastic++;
            }
        }

        double realPercent = (double) countNonPlastic / nItems;
        if (realPercent <= allowPercent) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
        
        in.close();
    }
}
