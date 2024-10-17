// Kattis - Who wins?
import java.util.*;

public class vemvinner {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        // Input the Tic-Tac-Toe board
        String[] firstRow = in.nextLine().trim().split(" ");
        String[] secondRow = in.nextLine().trim().split(" ");
        String[] thirdRow = in.nextLine().trim().split(" ");

        String fR0 = firstRow[0], fR1 = firstRow[1], fR2 = firstRow[2];
        String sR0 = secondRow[0], sR1 = secondRow[1], sR2 = secondRow[2];
        String tR0 = thirdRow[0], tR1 = thirdRow[1], tR2 = thirdRow[2];

        // Check if Johan wins (rows, columns, diagonals)
        if (fR0.equals("X") && fR1.equals("X") && fR2.equals("X") ||
                sR0.equals("X") && sR1.equals("X") && sR2.equals("X") ||
                tR0.equals("X") && tR1.equals("X") && tR2.equals("X") ||
                fR0.equals("X") && sR0.equals("X") && tR0.equals("X") ||
                fR1.equals("X") && sR1.equals("X") && tR1.equals("X") ||
                fR2.equals("X") && sR2.equals("X") && tR2.equals("X") ||
                fR0.equals("X") && sR1.equals("X") && tR2.equals("X") ||
                tR0.equals("X") && sR1.equals("X") && fR2.equals("X")) {
            System.out.println("Johan har vunnit");
        }

        // Check if Abdullah wins (rows, columns, diagonals)
        else if (fR0.equals("O") && fR1.equals("O") && fR2.equals("O") ||
                sR0.equals("O") && sR1.equals("O") && sR2.equals("O") ||
                tR0.equals("O") && tR1.equals("O") && tR2.equals("O") ||
                fR0.equals("O") && sR0.equals("O") && tR0.equals("O") ||
                fR1.equals("O") && sR1.equals("O") && tR1.equals("O") ||
                fR2.equals("O") && sR2.equals("O") && tR2.equals("O") ||
                fR0.equals("O") && sR1.equals("O") && tR2.equals("O") ||
                tR0.equals("O") && sR1.equals("O") && fR2.equals("O")) {
            System.out.println("Abdullah har vunnit");
        }

        // If no one has won
        else {
            System.out.println("ingen har vunnit");
        }

        in.close();
    }
}
