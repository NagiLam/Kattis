import java.util.*;

class leynithjonusta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email = in.nextLine();
        email = email.replaceAll("\\s+", "");
        in.close();

        System.out.println(email);
    }
}
