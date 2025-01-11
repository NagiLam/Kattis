// Kattis - Heimilisverk
import java.util.*;

public class heimilisverk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nChoresOnTheList = Integer.parseInt(in.nextLine());
        Set<String> choresSet = new LinkedHashSet<>();

        for (int i = 0; i < nChoresOnTheList; i++) {
            choresSet.add(in.nextLine());
        }

        for (String chore : choresSet) {
            System.out.println(chore);
        }

        in.close();
    }
}
