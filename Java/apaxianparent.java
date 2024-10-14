// Kattis - Honour Thy (Apaxian) Parent
import java.util.*;

public class apaxianparent {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().trim().split(" ");
        String nameY = input[0];
        String nameP = input[1];
        char nameYLastChar = nameY.charAt(nameY.length() - 1);

        if (nameYLastChar == 'e') {
            System.out.println(nameY + "x" + nameP);
        } else if (nameYLastChar == 'a' || nameYLastChar == 'i' || nameYLastChar == 'o' || nameYLastChar == 'u') {
            System.out.println(nameY.substring(0, nameY.length() - 1) + "ex" + nameP);
        } else if (nameY.substring(nameY.length() - 2, nameY.length()).equals("ex")) {
            System.out.println(nameY + nameP);
        } else {
            System.out.println(nameY + "ex" + nameP);
        }

        in.close();
    }
}
