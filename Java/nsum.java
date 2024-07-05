// Kattis - N-sum
import java.util.*;

class nsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nLines = Integer.parseInt(in.nextLine());
        int nSum = 0;
        
        for (int i = 0; i < nLines; i++) {
            nSum += in.nextInt();
        }

        System.out.println(nSum);
        in.close();
    }
}
