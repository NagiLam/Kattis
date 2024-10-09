// Kattis - A Second Opinion
import java.util.*;

public class secondopinion {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int inputSeconds = Integer.parseInt(in.nextLine());
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        hours = inputSeconds / 3600;
        inputSeconds = inputSeconds % 3600;
        minutes = inputSeconds / 60;
        seconds = inputSeconds % 60;

        System.out.println(hours + " : " + minutes + " : " + seconds);
        in.close();
    }
}
