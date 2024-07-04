// Kattis - Umferð
import java.util.*;

class umferd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cellsPerLane = Integer.parseInt(in.nextLine());
        int nLanes = Integer.parseInt(in.nextLine());
        int countEmpty = 0;

        for (int i = 0; i < nLanes; i++) {
            String symbol = in.nextLine();
            for (int j = 0; j < symbol.length(); j++) {
                if (symbol.charAt(j) == '.') {
                    countEmpty++;
                }
            }
        }

        System.out.println((double) countEmpty / (cellsPerLane * nLanes));
        in.close();
    }
}
