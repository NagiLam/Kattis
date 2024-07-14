// Kattis - Cut the Negativity
import java.util.*;

class cutthenegativity {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nCities = Integer.parseInt(in.nextLine());
        int nDirectFlight = 0;
        int[][] cityArr = new int[nCities][nCities];

        for (int i = 0; i < nCities; i++) {
            for (int j = 0; j < nCities; j++) {
                int value = in.nextInt();
                if (value > 0) {
                    nDirectFlight++;
                }
                cityArr[i][j] = value;
            }
        }

        System.out.println(nDirectFlight);
        for (int i = 0; i < nCities; i++) {
            for (int j = 0; j < nCities; j++) {
                if (cityArr[i][j] > 0) {
                    System.out.printf("%d %d %d%n", i + 1, j + 1, cityArr[i][j]);
                }
            }
        }

        in.close();
    }
}
