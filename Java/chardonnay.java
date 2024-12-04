// Kattis - Chardonnay
import java.util.*;

public class chardonnay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wineUseInDeCi = Integer.parseInt(in.nextLine());

        if (wineUseInDeCi >= 1 && wineUseInDeCi <= 6) {
            System.out.println(wineUseInDeCi + 1);
        } else {
            System.out.println(wineUseInDeCi);
        }

        in.close();
    }
}
