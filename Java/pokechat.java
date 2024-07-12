// Kattis - Pokechat
import java.util.*;

class pokechat {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String idNum = in.nextLine();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < idNum.length(); i = i + 3) {
            list.add(idNum.substring(i, i + 3));
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.print(s.charAt(Integer.parseInt(list.get(j).substring(1, 3)) - 1));
        }

        in.close();
    }
}
