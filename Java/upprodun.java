// Kattis - Arrangement
import java.util.*;

class upprodun {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int inRooms = Integer.parseInt(in.nextLine());
        int inTeams = Integer.parseInt(in.nextLine());
        int[] rooms = new int[inRooms];
        int index = 0;

        while (Arrays.stream(rooms).sum() < inTeams) {
            for (int i = 0; i < rooms.length; i++) {
                if (Arrays.stream(rooms).sum() < inTeams) {
                    rooms[i] += 1;
                } else
                    break;
            }
        }

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        in.close();
    }
}
