// Kattis - Speeding
import java.util.*;

public class speeding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nPhoto = Integer.parseInt(in.nextLine());
        int timeArr[] = new int[nPhoto];
        int distanceArr[] = new int[nPhoto];
        List<Integer> speedList = new ArrayList<>();

        for (int i = 0; i < nPhoto; i++) {
            timeArr[i] = in.nextInt();
            distanceArr[i] = in.nextInt();
        }

        for (int i = 1; i < nPhoto; i++) {
            int integralSpeed = (distanceArr[i] - distanceArr[i - 1]) / (timeArr[i] - timeArr[i - 1]);
            speedList.add(integralSpeed);
        }

        System.out.println(Collections.max(speedList));
        in.close();
    }
}
