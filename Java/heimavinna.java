// Kattis - Homework
import java.util.*;

class heimavinna {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(";");
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > 1) {
                String[] temp = new String[input[i].length()];
                temp = input[i].split("-");

                if (temp.length > 1) {
                    count += Integer.parseInt(temp[1]) - Integer.parseInt(temp[0]) + 1;
                } else {
                    count++;
                }

            } else {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
