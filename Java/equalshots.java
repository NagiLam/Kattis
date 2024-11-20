// Kattis - Equal Shots
import java.util.*;

public class equalshots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nIngredientsFirstShot = in.nextInt();
        int nIngredientsSecondShot = in.nextInt();

        int alcoholContentFirstShot = 0;
        for (int i = 0; i < nIngredientsFirstShot; i++) {
            int amount = in.nextInt();
            int ahContent = in.nextInt();
            alcoholContentFirstShot += amount * ahContent;
        }

        int alcoholContentSecondShot = 0;
        for (int i = 0; i < nIngredientsSecondShot; i++) {
            int amount = in.nextInt();
            int ahContent = in.nextInt();
            alcoholContentSecondShot += amount * ahContent;
        }

        if (alcoholContentFirstShot == alcoholContentSecondShot) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

        in.close();
    }
}
