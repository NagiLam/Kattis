// Kattis - Laptop Sticker
import java.util.*;

public class laptopsticker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int widthCom = in.nextInt();
        int heightCom = in.nextInt();
        int widthSticker = in.nextInt();
        int heightSticker = in.nextInt();

        if (widthCom - widthSticker >= 2 && heightCom - heightSticker >= 2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        in.close();
    }
}
