// Kattis - Songbook
import java.util.*;

public class sangbok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int availableTimeInSeconds = in.nextInt() * 60;
        int nSongs = in.nextInt();

        int[] songDurations = new int[nSongs];
        for (int i = 0; i < nSongs; i++) {
            songDurations[i] = in.nextInt();
        }

        Arrays.sort(songDurations);
        long totalPlayableTime = 0;
        for (int i = 0; i < nSongs; i++) {
            if (totalPlayableTime + songDurations[i] <= availableTimeInSeconds) {
                totalPlayableTime += songDurations[i];
            }
        }

        System.out.println(totalPlayableTime);
        in.close();
    }
}
