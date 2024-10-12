// Kattis - Pallatölur
import java.util.*;

public class pallatolur {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int startNumber = Integer.parseInt(in.nextLine());
        int endNumber = Integer.parseInt(in.nextLine());

        if (startNumber <= 2 && 2 <= endNumber) {
            System.out.println("1");
            System.out.println("2");
        }

        else {
            System.out.println(":(");
        }
        
        in.close();
    }
}
