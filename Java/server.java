// Kattis - Server
import java.util.*;

public class server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxNumberofTasks = in.nextInt();
        int maxTimeInMinute = in.nextInt();
        int count = 0;

        for (int i = 1; i <= maxNumberofTasks; i++) {
            int timePerTask = in.nextInt();
            if (maxTimeInMinute - timePerTask >= 0) {
                maxTimeInMinute -= timePerTask;
                count = i;
            } else {
                break;
            }
        }

        System.out.println(count);
        in.close();
    }
}
