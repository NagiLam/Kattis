// Kattis - Cetvrta
import java.util.*;

class cetvrta {
    public static int[] findFourthPoint(int x1, int y1, int x2, int y2, int x3, int y3) {
        int x4 = 0, y4 = 0;

        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        return new int[] { x4, y4 };
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int x3 = in.nextInt();
        int y3 = in.nextInt();

        int[] pointD = findFourthPoint(x1, y1, x2, y2, x3, y3);

        System.out.println(pointD[0] + " " + pointD[1]);
        in.close();
    }
}
