// Kattis - Soylent
import java.util.*;

public class soylent {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nTestCases = Integer.parseInt(in.nextLine());
        int caloPerBottle = 400;

        for (int i = 0; i < nTestCases; i++) {
            int caloriesPerDay = in.nextInt();
            int nBottles = caloriesPerDay / caloPerBottle;
            
            if (caloriesPerDay % caloPerBottle == 0) {
                System.out.println(nBottles);
            } else {
                System.out.println(nBottles + 1);
            }
        }

        in.close();
    }
}
