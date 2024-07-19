// Kattis - One Chicken Per Person!
import java.util.*;

class onechicken {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nPeople = in.nextInt();
        int nChickenPieces = in.nextInt();

        if (nChickenPieces > nPeople) {
            System.out.println((nChickenPieces - nPeople == 1)
                    ? "Dr. Chaz will have " + String.valueOf(nChickenPieces - nPeople) + " piece of chicken left over!"
                    : "Dr. Chaz will have " + String.valueOf(nChickenPieces - nPeople)
                            + " pieces of chicken left over!");
        } else {
            System.out.println((nPeople - nChickenPieces == 1)
                    ? "Dr. Chaz needs " + String.valueOf(nPeople - nChickenPieces) + " more piece of chicken!"
                    : "Dr. Chaz needs " + String.valueOf(nPeople - nChickenPieces) + " more pieces of chicken!");
        }

        in.close();
    }
}
