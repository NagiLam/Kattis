// Kattis - Akureyri
import java.util.*;

public class akureyri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nContestants = Integer.parseInt(in.nextLine());
        Map<String, Integer> locationMap = new HashMap<>();

        for (int i = 0; i < nContestants; i++) {
            String name = in.nextLine();
            String location = in.nextLine();
            locationMap.put(location, locationMap.getOrDefault(location, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : locationMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        in.close();
    }
}
