// Kattis - Seven Wonders
import java.util.*;

class sevenwonders {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        long tCount = input.chars().filter(ch -> ch == 'T').count();
        long cCount = input.chars().filter(ch -> ch == 'C').count();
        long gCount = input.chars().filter(ch -> ch == 'G').count();
        double result = Math.pow(tCount, 2) + Math.pow(cCount, 2) + +Math.pow(gCount, 2);
        int setCount = 0;
        int minNum = (int) Math.min(Math.min(tCount, cCount), gCount);

        for (int i = 0; i < minNum; i++) {
            tCount--;
            cCount--;
            gCount--;
            if (tCount >= 0 && cCount >= 0 && gCount >= 0) {
                setCount++;
            }
        }

        System.out.println((int) result + (setCount * 7));
        in.close();
    }
}
