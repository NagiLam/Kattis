// Kattis - Keys, Phone, Wallet
import java.util.*;

class keysphonewallet {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        List<String> arr = new ArrayList<>(Arrays.asList("keys", "phone", "wallet"));
        int nItems = Integer.parseInt(in.nextLine());

        for (int i = 0; i < nItems; i++) {
            String s = in.nextLine();
            if (arr.contains(s)) {
                arr.remove(s);
            }
        }

        Collections.sort(arr);
        if (arr.size() == 0) {
            System.out.println("ready");
        } else {
            for (String item : arr) {
                System.out.println(item);
            }
        }

        in.close();
    }
}
