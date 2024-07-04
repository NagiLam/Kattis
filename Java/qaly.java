// Kattis - Quality-Adjusted Life-Year
import java.util.*;

class qaly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int nPeriods = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nPeriods; i++) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            sum += a * b;
        }

        System.out.println(sum);
        in.close();
    }
}
