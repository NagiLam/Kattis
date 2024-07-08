// Kattis - Blaðra
import java.util.*;

class bladra2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int velo = in.nextInt();
        int accele = in.nextInt();
        int time = in.nextInt();
        in.close();

        double result = (velo * time) + (0.5 * accele * time * time);
        System.out.println(result);
    }
}
