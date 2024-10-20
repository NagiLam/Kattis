// Kattis - Booking a Room
import java.util.*;

public class bookingaroom {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int totalRoom = in.nextInt();
        int bookedRoom = in.nextInt();
        ArrayList<Integer> roomNumberList = new ArrayList<>();

        for (int i = 1; i < totalRoom + 1; i++) {
            roomNumberList.add(i);
        }

        for (int i = 0; i < bookedRoom; i++) {
            roomNumberList.remove(Integer.valueOf(in.nextInt()));
        }

        if (roomNumberList.isEmpty()) {
            System.out.println("too late");
        }

        else {
            Random rand = new Random();
            int randomIndex = rand.nextInt(roomNumberList.size());
            int randomElement = roomNumberList.get(randomIndex);
            System.out.println(randomElement);
        }

        in.close();
    }
}
