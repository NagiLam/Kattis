// Kattis - Ladder
import java.util.*;

class ladder {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        double height = in.nextInt();
        double angle = in.nextInt();
        angle = Math.toRadians(angle);
        angle = Math.sin(angle);

        System.out.println((int) Math.ceil(height / angle));
        in.close();
    }
}
