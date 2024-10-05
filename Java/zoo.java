// Kattis - Un-bear-able Zoo
import java.util.*;

public class zoo {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int index = 0;

        while (true) {
            int nTestCases = Integer.parseInt(in.nextLine().trim());

            if (nTestCases == 0) {
                break;
            }

            Map<String, Integer> animalCountMap = new HashMap<>();

            for (int i = 0; i < nTestCases; i++) {
                String[] animal = in.nextLine().toLowerCase().split(" ");
                String animalName = animal[animal.length - 1];
                animalCountMap.put(animalName, animalCountMap.getOrDefault(animalName, 0) + 1);
            }

            List<String> sortedAnimalNames = new ArrayList<>(animalCountMap.keySet());
            Collections.sort(sortedAnimalNames);

            index++;
            System.out.println("List " + index + ":");

            for (String animalName : sortedAnimalNames) {
                int count = animalCountMap.get(animalName);
                System.out.println(animalName + " | " + count);
            }
        }

        in.close();
    }
}
