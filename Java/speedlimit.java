// Kattis - Speed Limit
import java.util.*;

class speedlimit {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int nTest = Integer.parseInt(in.nextLine());
            int result = 0;
            if (nTest == -1) {
                break;
            }

            int oldTime = 0;
            for (int i = 0; i < nTest; i++) {
                int speed = in.nextInt();
                int time = in.nextInt();
                result += speed * (time - oldTime);
                oldTime = time;
            }
            System.out.println(result + " miles");
            in.nextLine();
        }

        in.close();
    }
}
