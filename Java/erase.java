// Kattis - Erase Securely
import java.util.*;

public class erase {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nTimesWrite = Integer.parseInt(in.nextLine());
        String inputBeforeDelete = in.nextLine();
        String inputAfterDelete = in.nextLine();
        boolean flag = true;

        for (int i = 0; i < inputBeforeDelete.length(); i++) {
            char bit = inputBeforeDelete.charAt(i);
            for (int j = 0; j < nTimesWrite; j++) {
                if (bit == '1') {
                    bit = '0';
                } else if (bit == '0') {
                    bit = '1';
                }
            }

            if (bit != inputAfterDelete.charAt(i)) {
                flag = false;
                break;
            }
        }

        System.out.println((flag) ? "Deletion succeeded" : "Deletion failed");
        in.close();
    }
}
