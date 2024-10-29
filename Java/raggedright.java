// Kattis - Ragged Right
import java.util.*;

public class raggedright {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        List<Integer> lengthList = new ArrayList<>();

        while (in.hasNextLine()) {
            lengthList.add(in.nextLine().length());
        }

        int maxLength = Collections.max(lengthList);
        int raggedness = 0;

        for (int i = 0; i < lengthList.size() - 1; i++) {
            if (lengthList.get(i) < maxLength) {
                raggedness += (maxLength - lengthList.get(i)) * (maxLength - lengthList.get(i));
            }
        }

        System.out.println(raggedness);
        in.close();
    }
}
