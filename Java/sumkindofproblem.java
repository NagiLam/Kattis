// Kattis - Sum Kind of Problem
import java.util.*;

class sumkindofproblem {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int dataSets = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= dataSets; i++) {
            in.nextInt();
            int number = in.nextInt();
            System.out.print(i + " ");
            System.out.print((number * (number + 1)) / 2 + " ");
            System.out.print(number * number + " ");
            System.out.println(number * (number + 1));
        }
        
        in.close();
    }
}
