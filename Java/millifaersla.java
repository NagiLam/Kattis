// Kattis - Millifærsla
// You can just read 3 numbers and use if to compare them
// For this problem I just want to practice with switch case
import java.util.*;

class millifaersla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int index = 0;
        Integer min = Integer.MAX_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
                index = j;
            }
        }

        switch (index) {
            case 0:
                System.out.println("Monnei");
                break;
            case 1:
                System.out.println("Fjee");
                break;
            case 2:
                System.out.println("Dolladollabilljoll");
                break;
        }
    }
}
