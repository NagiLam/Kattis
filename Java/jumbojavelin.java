// Kattis - Jumbo Javelin
import java.util.*;

class jumbojavelin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nRods = Integer.parseInt(in.nextLine());
        int sum = 0;

        for (int i = 0; i < nRods; i++) {
            sum += in.nextInt();
        }

        System.out.println(sum - (nRods - 1));
        in.close();
    }
}
