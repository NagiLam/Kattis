// Kattis - Hissing Microphone
import java.util.*;

class hissingmicrophone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println((s.contains("ss") ? "hiss" : "no hiss"));
        in.close();
    }
}
