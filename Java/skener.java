// Kattis - Skener
import java.util.*;

class skener {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int zrows = in.nextInt();
        int zcols = in.nextInt();
        in.nextLine();

        for (int i = 0; i < rows; i++) {
            StringBuilder input = new StringBuilder(in.nextLine());
            for (int j = 0; j < zrows; j++) {
                for (int k = 0; k < input.length(); k++) {
                    System.out.print(String.valueOf(input.charAt(k)).repeat(zcols));
                }
                System.out.println();
            }
        }

        in.close();
    }
}
