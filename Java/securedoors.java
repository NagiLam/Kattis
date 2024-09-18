// Kattis - Secure Doors
import java.util.*;

public class securedoors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int logLength = Integer.parseInt(in.nextLine());
        ArrayList<String> listEntries = new ArrayList<>();

        for (int i = 0; i < logLength; i++) {
            String[] inputSplit = in.nextLine().split(" ");
            String action = inputSplit[0];
            String name = inputSplit[1];

            if (action.equals("entry") && !listEntries.contains(name)) {
                System.out.println(name + " entered");
                listEntries.add(inputSplit[1]);
            }

            else if (action.equals("entry") && listEntries.contains(name)) {
                System.out.println(name + " entered (ANOMALY)");
            }

            if (action.equals("exit") && !listEntries.contains(name)) {
                System.out.println(name + " exited (ANOMALY)");
            }

            else if ((action.equals("exit") && listEntries.contains(name))) {
                listEntries.remove(inputSplit[1]);
                System.out.println(name + " exited");
            }
        }

        in.close();
    }
}
