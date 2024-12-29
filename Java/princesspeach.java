// Kattis - Saving Princess Peach
import java.util.*;

public class princesspeach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nObstacles = in.nextInt();
        int nObstaclesFoundByMario = in.nextInt();
        Set<Integer> obstaclesFoundSet = new HashSet<>();

        for (int i = 0; i < nObstaclesFoundByMario; i++) {
            int obstacle = in.nextInt();
            obstaclesFoundSet.add(obstacle);
        }

        int count = 0;
        for (int i = 0; i < nObstacles; i++) {
            if (obstaclesFoundSet.contains(i)) {
                count++;
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Mario got " + count + " of the dangerous obstacles.");
        in.close();
    }
}
