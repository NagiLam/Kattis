// Kattis - Pizza Crust
import java.util.*;

public class pizza2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int crust = in.nextInt();

        if (crust > radius) {
            System.out.println("0.000000");
        } else {
            double totalArea = radius * radius * Math.PI;
            double remainingArea = (radius - crust) * (radius - crust) * Math.PI;
            double percentage = (remainingArea / totalArea) * 100;

            System.out.printf("%.6f%n", percentage);
        }

        in.close();
    }
}
