// Katis - Blandað Best
import java.util.*;

class blandadbest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nMeatType = Integer.parseInt(in.nextLine());

        int nautaCount = 0;
        int kjukCount = 0;
        for (int i = 0; i < nMeatType; i++) {
            String meatType = in.nextLine();
            if (meatType.equals("nautakjot")) {
                nautaCount++;
            }

            if (meatType.equals("kjuklingur")) {
                kjukCount++;
            }
        }

        if (nautaCount >= 1 && kjukCount == 0) {
            System.out.println("nautakjot");
        }

        if (kjukCount >= 1 && nautaCount == 0) {
            System.out.println("kjuklingur");
        }

        if (kjukCount >= 1 && nautaCount >= 1) {
            System.out.println("blandad best");
        }
        in.close();
    }
}
