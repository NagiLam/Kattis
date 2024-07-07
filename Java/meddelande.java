// Kattis - Message
import java.util.*;

class meddelande {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nRow = in.nextInt();
        int nCol = in.nextInt();
        in.nextLine();
        String message = "";

        for (int i = 0; i < nRow; i++) {
            String input = in.nextLine();

            for (int j = 0; j < nCol; j++) {
                if (input.charAt(j) != '.') {
                    message += input.charAt(j);
                } else {
                    message += "";
                }
            }
        }

        System.out.println(message);
        in.close();
    }
}
