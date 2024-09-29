// Kattis - What does the fox say?
import java.util.*;

public class whatdoesthefoxsay {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nTestcases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nTestcases; i++) {
            ArrayList<String> soundsList = new ArrayList<>();
            String[] record = in.nextLine().split(" ");
            
            while (true) {
                String input = in.nextLine();
                if (input.equals("what does the fox say?")) {
                    break;
                } else {
                    String[] inputSplit = input.split(" ");
                    soundsList.add(inputSplit[2]);
                }
            }

            for (String sound : record) {
                if (!soundsList.contains(sound)) {
                    System.out.print(sound + " ");
                }
            }
        }

        in.close();
    }
}
