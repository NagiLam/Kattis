// Kattis - Prjónamynstur
import java.util.*;

class prjonamynstur {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> valueMap = new HashMap<String, Integer>();
        valueMap.put(".", 20);
        valueMap.put("O", 10);
        valueMap.put("\\", 25);
        valueMap.put("/", 25);
        valueMap.put("A", 35);
        valueMap.put("^", 5);
        valueMap.put("v", 22);

        int nRows = in.nextInt();
        int nCols = in.nextInt();
        in.nextLine();

        int sum = 0;
        for (int i = 0; i < nRows; i++) {
            String s = in.nextLine();
            for (int j = 0; j < nCols; j++) {
                sum += valueMap.get(String.valueOf(s.charAt(j)));
            }
        }

        System.out.println(sum);
        in.close();
    }
}
