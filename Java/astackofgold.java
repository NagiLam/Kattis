// Kattis - A Stack of Gold
import java.util.*;

public class astackofgold {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weightInMilligrams = in.nextInt();
        int numberOfCoinStacks = in.nextInt();

        int tungstenWeight = 29260 * (numberOfCoinStacks * (numberOfCoinStacks + 1)) / 2;
        int stackWithGold = (weightInMilligrams - tungstenWeight) / 110;

        System.out.println(stackWithGold);
        in.close();
    }
}
