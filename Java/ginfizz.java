// Kattis - Gin Fizz
import java.util.*;

public class ginfizz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nGinFizz = Integer.parseInt(in.nextLine());
        int mlGin = 45;
        int mlJuice = 30;
        int mlSyrup = 10;
        int lemonSlice = 1;

        System.out.println(mlGin * nGinFizz + " ml gin");
        System.out.println(mlJuice * nGinFizz + " ml fresh lemon juice");
        System.out.println(mlSyrup * nGinFizz + " ml simple syrup");

        if (nGinFizz == 1) {
            System.out.println(lemonSlice * nGinFizz + " slice of lemon");
        } else {
            System.out.println(lemonSlice * nGinFizz + " slices of lemon");
        }

        in.close();
    }
}
