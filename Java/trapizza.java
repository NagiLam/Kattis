// Kattis - Trapizza
import java.util.*;

public class trapizza {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mahjongDiameter = Integer.parseInt(in.nextLine());
        int trapLengthSide1 = Integer.parseInt(in.nextLine());
        int trapLengthSide2 = Integer.parseInt(in.nextLine());
        int trapHeight = Integer.parseInt(in.nextLine());

        double mahjongArea = (Math.PI / 4) * mahjongDiameter * mahjongDiameter;
        double trapArea = (trapLengthSide1 + trapLengthSide2) * trapHeight * 0.5;

        if (mahjongArea > trapArea) {
            System.out.println("Mahjong!");
        } else if (mahjongArea < trapArea) {
            System.out.println("Trapizza!");
        } else {
            System.out.println("Jafn storar!");
        }

        in.close();
    }
}
