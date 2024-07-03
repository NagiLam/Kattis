// Kattis - Hipp Hipp Húrra
import java.util.*;

class hipphipphurra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = Integer.parseInt(in.nextLine());

        for (int i = 0; i < age; i++) {
            System.out.println("Hipp hipp hurra, " + name + "!");
        }
        in.close();
    }
}
