// Kattis - Provinces and Gold
import java.util.*;

class provincesandgold {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        final String pro = "Province";
        final String duc = "Duchy";
        final String est = "Estate";
        final String gol = "Gold";
        final String sil = "Silver";
        final String cop = "Copper";
        int gold = in.nextInt();
        int silver = in.nextInt();
        int copper = in.nextInt();
        int buyPower = (gold * 3) + (silver * 2) + copper;

        if (buyPower <= 1) {
            System.out.println(cop);
        }

        else if (buyPower == 2) {
            System.out.println(est + " or " + cop);
        }

        else if (buyPower >= 3 && buyPower <= 4) {
            System.out.println(est + " or " + sil);
        }

        else if (buyPower == 5) {
            System.out.println(duc + " or " + sil);
        }

        else if (buyPower >= 6 && buyPower <= 7) {
            System.out.println(duc + " or " + gol);
        }

        else {
            System.out.println(pro + " or " + gol);
        }

        in.close();
    }
}
