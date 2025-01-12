// Kattis - Púsluspil
import java.util.*;

public class pusluspil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nBoxes = in.nextInt();
        int mPuzzlePieces = in.nextInt();
        boolean[] foundPieces = new boolean[mPuzzlePieces + 1];
        int foundCount = 0;

        for (int i = 0; i < nBoxes; i++) {
            int nPuzzlesInBox = in.nextInt();

            for (int j = 0; j < nPuzzlesInBox; j++) {
                int piece = in.nextInt();

                if (piece >= 1 && piece <= mPuzzlePieces && !foundPieces[piece]) {
                    foundPieces[piece] = true;
                    foundCount++;
                }
            }
        }

        if (foundCount == mPuzzlePieces) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
        in.close();
    }
}
