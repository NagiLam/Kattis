// Kattis - Simon Says
 import java.util.*;

class simonsays {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nLines = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nLines; i++) {
            String s = in.nextLine();
            if (s.contains("Simon says")) {
                s = s.replace("Simon says ", "");
                System.out.println(s);
            }
        }

        in.close();
    }
}
