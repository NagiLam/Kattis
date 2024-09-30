// Kattis - Line Them Up
import java.util.*;

public class lineup {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nPeople = Integer.parseInt(in.nextLine());
        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0; i < nPeople; i++) {
            nameList.add(in.nextLine());
        }

        ArrayList<String> alphaSort = new ArrayList<>(nameList);
        ArrayList<String> reverseSort = new ArrayList<>(nameList);
        Collections.sort(alphaSort);
        Collections.sort(reverseSort, Collections.reverseOrder());

        if (nameList.equals(alphaSort)) {
            System.out.println("INCREASING");
        }

        else if (nameList.equals(reverseSort)) {
            System.out.println("DECREASING");
        }

        else {
            System.out.println("NEITHER");
        }

        in.close();
    }
}
