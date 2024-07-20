// Kattis - Seven Wonders
import java.util.*;

class sevenwonders {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        long tCount = input.chars().filter(ch -> ch == 'T').count();
        long cCount = input.chars().filter(ch -> ch == 'C').count();
        long gCount = input.chars().filter(ch -> ch == 'G').count();
        int result = (int) (Math.pow(tCount, 2) + Math.pow(cCount, 2) + Math.pow(gCount, 2));
        int minNum = (int) Math.min(Math.min(tCount, cCount), gCount);

        if (minNum > 0) {
            result += minNum * 7;
        }

        System.out.println(result);
        in.close();
    }
}
