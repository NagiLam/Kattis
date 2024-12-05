// Kattis - Ethanol
import java.util.*;

public class ethanol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nCarbon = Integer.parseInt(in.nextLine());
        String firstFifthLine = " H";
        String secondFourthLine = " |";
        String thirdLine = "-C";

        System.out.println(" " + firstFifthLine.repeat(nCarbon));
        System.out.println(" " + secondFourthLine.repeat(nCarbon));
        System.out.println("H" + thirdLine.repeat(nCarbon) + "-OH");
        System.out.println(" " + secondFourthLine.repeat(nCarbon));
        System.out.println(" " + firstFifthLine.repeat(nCarbon));
        in.close();
    }
}
