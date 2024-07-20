// Kattis - SMIL
import java.util.*;

class smil {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] symbol = { ":)", ";)", ":-)", ";-)" };
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < symbol.length; i++) {
            int index = input.indexOf(symbol[i]);
            while (index >= 0) {
                list.add(index);
                index = input.indexOf(symbol[i], index + 1);
            }
        }

        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        in.close();
    }
}
