// Kattis - IsItHalloween.com
import java.util.*;

class isithalloween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> hallow = new ArrayList<String>(Arrays.asList("OCT 31", "DEC 25"));

        String input = in.nextLine();
        if (hallow.contains(input)) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }

        in.close();
    }
}
