// Kattis - Espresso!
import java.util.*;

public class espresso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nStudents = in.nextInt();
        int waterTankOuncesMax = in.nextInt();
        in.nextLine();

        if (nStudents <= 0) {
            System.out.println("0");
            in.close();
            return;
        }

        int waterTankOunces = waterTankOuncesMax;
        int count = 0;
        for (int i = 0; i < nStudents; i++) {
            String input = in.nextLine();
            int waterNeeded = Character.getNumericValue(input.charAt(0));
            if (input.length() > 1) {
                waterNeeded += 1;
            }

            if (waterTankOunces - waterNeeded < 0) {
                count++;
                waterTankOunces = waterTankOuncesMax;
            }
            waterTankOunces -= waterNeeded;
        }

        System.out.println(count);
        in.close();
    }
}
