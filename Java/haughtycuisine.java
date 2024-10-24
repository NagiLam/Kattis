// Kattis - Haughty Cuisine
import java.util.*;

public class haughtycuisine {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int setMenu = Integer.parseInt(in.nextLine());
        HashMap<Integer, String> menuHashMap = new HashMap<>();

        for (int i = 0; i < setMenu; i++) {
            String input = in.nextLine().trim();
            String[] parts = input.split(" ", 2);
            int menuNumber = Integer.parseInt(parts[0]);
            String dishName = parts[1];
            menuHashMap.put(menuNumber, dishName);
        }

        Random rand = new Random();
        List<Integer> keys = new ArrayList<>(menuHashMap.keySet());
        int randomKey = keys.get(rand.nextInt(keys.size()));

        System.out.println(randomKey);
        String[] result = menuHashMap.get(randomKey).split(" ");

        for (String dish : result) {
            System.out.println(dish);
        }
        
        in.close();
    }
}
