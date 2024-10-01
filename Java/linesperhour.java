// Kattis - Lines Per Hour
import java.util.*;

public class linesperhour {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int nProblems = in.nextInt();
        int lineOfCodePerHour = in.nextInt();
        int maxLineOfCode = lineOfCodePerHour * 5;
        ArrayList<Integer> locList = new ArrayList<>();

        for (int i = 0; i < nProblems; i++) {
            int lineofCode = in.nextInt();
            locList.add(lineofCode);
        }

        Collections.sort(locList);
        int maxProblems = 0;
        int locCount = 0;

        for (Integer integer : locList) {
            locCount += integer;
            if (locCount > maxLineOfCode) {
                break;
            }
            maxProblems++;
        }

        System.out.println(maxProblems);
        in.close();
    }
}
